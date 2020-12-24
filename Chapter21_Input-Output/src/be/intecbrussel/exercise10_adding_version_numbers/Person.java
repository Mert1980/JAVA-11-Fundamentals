package be.intecbrussel.exercise10_adding_version_numbers;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Serializable {
    public static final long serialVersionUID = -424743364485144435L;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String birthPlace;
    private transient Timer hartbeat;

    public Person(String firstName, String lastName, LocalDate birthDay, String birthPlace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        hartbeat = new Timer(true);
        hartbeat.scheduleAtFixedRate(new HeartBeat(), 0, 3000);
    }

    private class HeartBeat extends TimerTask{
        @Override
        public void run() {
            System.out.println("*");
        }
    }

    private void readObject(ObjectInputStream s)throws IOException,
            ClassNotFoundException{
        s.defaultReadObject();
        hartbeat = new Timer(true);
        hartbeat.scheduleAtFixedRate(new HeartBeat(), 0, 3000);
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", birthDay=" + birthDay + '}';
    }
}
