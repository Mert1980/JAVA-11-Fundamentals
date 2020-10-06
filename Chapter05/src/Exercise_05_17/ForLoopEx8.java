package Exercise_05_17;

public class ForLoopEx8 {
    public static void main(String[] args) {
        int count = 0;
        boolean isPrime = true;

        for (int i = 2 ; i < 1000; i++) {
            isPrime=true;
            for (int j = 2; j < i; j++) {
               if(i % j == 0){
                   isPrime = false;
                   break;
               }
            }
            if(isPrime){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The total count of prime numbers: " + count);
    }
}
