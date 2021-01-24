package be.intecbrussel.exercise09_wait_notify.message_app;

import java.util.Random;

/*
read and write methods are alternating access to the private String message; variable in the Message class for
the two threads, Reader and Writer.
In other words, when empty is true, the thread trying to access the read() method will be waiting while the
thread trying to access the write() method will be setting message to the next message that was just read from
the messages[] array. Then, when empty is changed to false at that point, the thread trying to access write() will
be waiting while the other thread accesses read() and returns the current message to be printed to output.
The empty variable switches back and forth between true and false to create an alternating wait/execute type of action.
But this is happening in nanoseconds, which is the reason for the Random() object to simulate the wait period.
Note for notify() and notifyAll(): We can use notify() method to give the notification for only one thread which is
waiting for a particular object whereas by the help of notifyAll() methods we can give the notification to all waiting
threads of a particular object. If multiple threads are waiting for the notification and we use notify() method then
only one thread get the notification and the remaining thread have to wait for further notification. Which thread
will get the notification we can’t expect because it totally depends upon the JVM. But when we use notifyAll()
method then multiple threads got the notification but execution of threads will be performed one by one because
thread requires lock and only one lock is available for one object.
 */

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while(empty) {
            try {
                wait();
            } catch(InterruptedException e) {

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while(!empty) {
            try {
                wait();
            } catch(InterruptedException e) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for(int i=0; i<messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished");
                latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
    }
}
