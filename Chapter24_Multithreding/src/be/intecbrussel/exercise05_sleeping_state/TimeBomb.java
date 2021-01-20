package be.intecbrussel.exercise05_sleeping_state;

public class TimeBomb {
    private Thread thread;
    private int seconds;

    public TimeBomb(int seconds) {
        this.seconds = seconds;
    }

    public void activate(){
        thread = new Thread(()-> print(seconds));
        thread.start();
    }

    private void print(int seconds) {
        for (int i = seconds; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Disarmed!");
                return;
            }
            System.out.println("Timebomb ticking: " + i + " left");
        }
        System.out.println("Boooooom! ! !");
    }

    public void disarm(){
        thread.interrupt();
    }
}
