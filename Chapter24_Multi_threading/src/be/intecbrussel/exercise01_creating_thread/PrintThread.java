package be.intecbrussel.exercise01_creating_thread;

public class PrintThread extends Thread{
    private String text;
    private int count;

    public PrintThread(String text, int count){
        this.text = text;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
    }
}
