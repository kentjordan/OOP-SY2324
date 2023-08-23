package Module1;

import java.util.Scanner;

public class ExtraAct1 {

    public void run(){
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num0 = inputScanner.nextFloat();

        System.out.print("Enter second number: ");
        float num1 = inputScanner.nextFloat();

        System.out.print("Enter operation: ");
        char operator = inputScanner.next().charAt(0);

        switch (operator) {
            case '+' -> {
                float sum = num0 + num1;
                System.out.println(num0 + " " + operator + " " + num1 + " = " + sum);
            }
            case '-' -> {
                float difference = num0 - num1;
                System.out.println(num0 + " " + operator + " " + num1 + " = " + difference);
            }
            case '*' -> {
                float product = num0 * num1;
                System.out.println(num0 + " " + operator + " " + num1 + " = " + product);
            }
            case '/' -> {
                float quotient = num0 / num1;
                System.out.println(num0 + " " + operator + " " + num1 + " = " + quotient);
            }
        }

    }
}
