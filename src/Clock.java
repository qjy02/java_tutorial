import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Clock implements Runnable {

    private final LocalTime alarmTime;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private volatile boolean alarmRunning = true;
    private Clip alarmClip;

    // Path to alarm sound (outside src is OK)
    private final String filePath = "music/alarm.wav";

    Clock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {

        // Thread to listen for ENTER key
        Thread stopListener = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine(); // ENTER stops alarm
            alarmRunning = false;
            stopSound();
            System.out.println("🔕 Alarm stopped.");
        });

        stopListener.start();

        while (alarmRunning) {
            LocalTime now = LocalTime.now();
            System.out.println(now.format(formatter));

            if (!now.isBefore(alarmTime)) {
                System.out.print("⏰ ALARM! Press ENTER to stop");

                playSound(); // start alarm sound

                // Keep running until user stops
                while (alarmRunning) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        stopSound();
                        return;
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    // Play alarm.wav in a loop
    private void playSound() {
        try {
            File soundFile = new File(filePath);

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            alarmClip = AudioSystem.getClip();
            alarmClip.open(audioStream);
            alarmClip.loop(Clip.LOOP_CONTINUOUSLY);
            alarmClip.start();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("❌ Unsupported audio format (use WAV only).");

        } catch (LineUnavailableException e) {
            System.out.println("❌ Audio line unavailable (sound device busy).");

        } catch (IOException e) {
            System.out.println("❌ Audio file not found or cannot be read.");

        }
    }

    // Stop and clean up sound
    private void stopSound() {
        if (alarmClip != null) {
            if (alarmClip.isRunning()) {
                alarmClip.stop();
            }
            alarmClip.close();
        }
    }
}