package ExtraExercises;

    public class MethodDemo {
        public static int sum(int number1, int number2) {
            int total = number1 + number2;
            System.out.println("sum almost finished");
            return total;
        }

        public static void main(String[] args) {
            int a = 10, b = 20, c = 30, d = 40;
            printSum(b, d);
            System.out.println("main finished");
        }

        public static void printSum(int a, int b) {
            System.out.println(sum(a, b));
            System.out.println("printSum finished");
        }


    }

