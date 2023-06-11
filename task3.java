import java.util.Scanner;

import javax.lang.model.element.Element;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите действие: +, -, *, / : ");
        String operator = scanner.next();

        scanner.close();
        double result = 0;

        switch (operator) {
            case "+" :
              result = num1 + num2;
              break;

            case "-" :
              result = num1 - num2;
              break;

            case "*" :
              result = num1 * num2;
              break;

            case "/" :
              if (num2 != 0) {
                  result = num1 / num2;
              } else {
                  System.out.println("Ошибка");
                  return;
              }
              break;

        }
    System.out.println("Результат = " + result);    
    }
}
