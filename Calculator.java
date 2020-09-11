import java.util.Scanner;
public class Calculator {
    public static void main(String[] args ) {
        boolean isRunning = true;

        Scanner in = new Scanner(System.in);

        while (isRunning) {
            System.out.println("Choose operator");
            String operator = in.next();

             try {
                 System.out.println("Please, enter a number");
                 
             } catch (NumberFormatException ex) {
                 

             }
        
             System.out.println("Num1:");
             double num1 = in.nextDouble();
             System.out.println("Num2:");
             double num2 = in.nextDouble();

             switch(operator) { //löser så att du kan byta mellan +-*/
                case "+":
                    System.out.println(addition(num1, num2));
                    break;
                case "-":
                     System.out.println(subtraction(num1, num2));
                    break;
                case "*":
                    System.out.println(multiplication(num1, num2));
                    break;
                case "/":
                    System.out.println(division(num1, num2));}
                    
        

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

    public static double subtraction(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiplication(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
