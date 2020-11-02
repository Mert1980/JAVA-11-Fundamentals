package Exercise_02Nov2020;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b){
            return b.getAge() - a.getAge();
    }
}

