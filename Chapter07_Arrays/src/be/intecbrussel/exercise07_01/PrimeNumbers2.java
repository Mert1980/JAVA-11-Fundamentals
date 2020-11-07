package be.intecbrussel.exercise07_01;

public class PrimeNumbers2 {
    public static void main(String[] args) {
        int limit = 100;
        int[] primeArray = new int[limit / 2];
        primeArray[0] = 2;
        int counter = 1;

        for (int i = 3; i < limit; i += 2) {
            if (isPrime(i, primeArray)) {
                primeArray[counter] = i;
                counter++;
            }
        }

        System.out.println("");
        for (int number : primeArray) {
            System.out.print(number + " ");
        }
    }

    public static boolean isPrime(int number, int[] primes) {
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != 0 && number % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
