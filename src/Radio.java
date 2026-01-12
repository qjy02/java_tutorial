public class Radio {
    private Music music; // composition

    Radio() {
        this.music = new Music();
    }

    void powerOn() {
        music.play();
        System.out.println("Radio power is on");
    }

    void powerOff() {
        music.stop();
        System.out.println("Radio power is off");
    }
}
