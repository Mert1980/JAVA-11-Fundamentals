package be.intecbrussel.exercise02_local_nested_class;

public class Musician {

    public Object play(){
        final int COUNT = 0;
        int a = 3;

        class Instrument {
           public void makeSound(){
                System.out.println("Violin makes sound!");
                // count+=1; --> count variable in inner class is considered as final and can not be changed
            }
            @Override
            public String toString(){
               return  "instrument number " + a;
            }
        }
        Instrument violin = new Instrument();
        violin.makeSound();
        System.out.println(COUNT);
        //a = 2;
        System.out.println(a); // prints 2
        return new Instrument();
    }
}
