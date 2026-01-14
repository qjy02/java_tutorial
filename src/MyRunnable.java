public class MyRunnable implements Runnable {
    private final String text;

    MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // 1 second
                System.out.println(text);
                //System.out.println(Thread.currentThread().getName() + " " + i);
            } catch(InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            if(i == 5) {
                System.out.println("\nTime's up!");
                System.exit(0); // End your program
            }
        }
    }
}
