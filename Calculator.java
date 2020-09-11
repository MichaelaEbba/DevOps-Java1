import java.util.Scanner;

public class Calculator {
    public static void main(String[] args ) {
        boolean isRunning = true;

        Scanner in = new Scanner(System.in);

        while (isRunning) {
            System.out.println("Choose operator");
            String operator = in.next();//Choose the operator, first question
             
        
             
             double Num1 = 0;
             double Num2 = 0;

             
             try {
                 System.out.println("Num1:");
                 Num1 = in.nextDouble();
             } catch (Exception ex) {
                 System.out.println("Something went wrong");
                }

             try {
                 System.out.println("Num2:");
                 Num2 = in.nextDouble();
             } catch (Exception ex)  {
                 System.out.println("Something went wrong"); //Try/catch makes it not crash if u type letters
             }

            

             switch(operator) { //löser så att du kan byta mellan +-*/
                case "+":
                    System.out.println(addition(Num1, Num2));
                    break;
                case "-":
                     System.out.println(subtraction(Num1, Num2));
                    break;
                case "*":
                    System.out.println(multiplication(Num1, Num2));
                    break;
                case "/":
                    System.out.println(division(Num1, Num2));
                    break; 
                default:
                    System.out.println("Something went wrong");
                    break;
             }
                    
        

            System.out.println("Enter bye to exit");
            String input = in.nextLine();
            if (input.equals("bye")) {
                isRunning = false; //Cancel the loop so you can quit the program
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
        return result; //so it knows how yo count
    }
}