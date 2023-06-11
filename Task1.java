import java.nio.charset.Charset;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        int triangleNumber = calculateTriangNumber(n);
        System.out.println("Треугольное число от " + n + " = " + triangleNumber);

        

        int factorial = calculateFactorial(n);
        System.out.println("Факториал числа от " + n + " = " + factorial);


    }

    public static int calculateTriangNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
