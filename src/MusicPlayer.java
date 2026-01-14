import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {

    public static void show() {
        // JAVA Music Player
        String filePath = "music/rain.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equalsIgnoreCase("Q")) {

                System.out.println("\n=== Music Player ===");
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.nextLine().toUpperCase();

                switch (response) {
                    case "P":
                        if (!clip.isRunning()) {
                            clip.start();
                        }
                        break;

                    case "S":
                        if (clip.isRunning()) {
                            clip.stop();
                        }
                        break;

                    case "R":
                        clip.stop();
                        clip.setMicrosecondPosition(0);
                        clip.start();
                        break;

                    case "Q":
                        clip.stop();
                        clip.close();
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("❌ Audio file format not supported.");

        } catch (LineUnavailableException e) {
            System.out.println("❌ Audio line unavailable.");

        } catch (IOException e) {
            System.out.println("❌ File not found or cannot be read.");
        }
    }
}