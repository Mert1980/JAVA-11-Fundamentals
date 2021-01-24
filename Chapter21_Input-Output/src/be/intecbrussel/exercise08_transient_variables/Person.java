package be.intecbrussel.exercise08_transient_variables;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private transient Timer hartBeat;

    public Person(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        hartBeat = new Timer(true);
        hartBeat.scheduleAtFixedRate(new HartBeat(), 0, 1000);
    }

    protected static class HartBeat extends TimerTask{
        @Override
        public void run() {
            System.out.println("*");
        }
    }

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

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", birthDay=" + birthDay + '}';
    }
}
