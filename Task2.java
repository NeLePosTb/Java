public class Task2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000: ");
        printPrimeNumber(1, 1000);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void  printPrimeNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
