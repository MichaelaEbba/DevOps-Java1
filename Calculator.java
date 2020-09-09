import java.util.Scanner;
public class Calculator {
    public static void main(String[] args ) {
        boolean isRunning = true;
        Scanner in = new Scanner(System.in);

        while (isRunning) {
            String operator = in.next();
            switch(operator) {
                case "+":
                    double num1 = in.nextDouble();
                    double num2 = in.nextDouble();
                    System.out.println(addition(num1, num2));
                    break;
                case "-":
                    double num3 = in.nextDouble();
                    double num4 = in.nextDouble();
                    System.out.println(subtraction(num3, num4));
                    break;
                case "*":
                    double num5 = in.nextDouble();
                    double num6 = in.nextDouble();
                    System.out.println(multiplication(num5, num6));
                    break;
                case "/":
                    double num7 = in.nextDouble();
                    double num8 = in.nextDouble();
                    System.out.println(division(num7, num8));}
                    
        

            System.out.println("Enter bye to exit");
            String input = in.nextLine();
            if (input.equals("bye")) {
                isRunning = false;
            }
        }
        System.out.println("You have exited");
        in.close();

    }

    public static double addition(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtraction(double num3, double num4) {
        double result = num3 - num4;
        return result;
    }

    public static double multiplication(double num5, double num6) {
        double result = num5 * num6;
        return result;
    }

    public static double division(double num7, double num8) {
        double result = num7 / num8;
        return result;
    }
}