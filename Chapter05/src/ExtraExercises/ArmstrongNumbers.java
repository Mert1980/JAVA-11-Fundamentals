package ExtraExercises;

public class ArmstrongNumbers {
    public static void main(String[] args)
    {
        int digit1,  // To hold first digit (Ones) of number
            digit2,  // To hold second digit (Tens) of number
            digit3;  // To hold third digit (Hundreds) of number

        for(int number = 1; number <= 500; number++)
        {
            int temp = number;
            digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;

            temp = temp / 10;
            digit3 = temp % 10;

            if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
            {
                System.out.println(number);
                System.out.println("digit1: " + digit1);
                System.out.println("digit2: " + digit2);
                System.out.println("digit3: " + digit3);
            }
        }
    }
}
