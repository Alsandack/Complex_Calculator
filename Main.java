import java.util.Scanner;

/**
 * Created by Owner on 2/26/2016.
 */
public class Main {
    public static void main(String args[]) {

        String s1 = getInput("Enter numeric value: ");
        String s2 = getInput("Enter numeric value: ");
        String s3 = getInput("Enter a mathematical operator(+ - * /)");

        try {
            switch(s3){
                case "+": s3 = "+";
                    double result = addValues(s1,s2);
                    System.out.println("The answer is: " + result);
                    break;
                case "-": s3 = "-";
                    double result2 = subValues(s1, s2);
                    System.out.println("The answer is: " + result2);
                    break;
                case "*": s3 = "*";
                    double result3 = multValues(s1, s2);
                    System.out.println("The answer is: " + result3);
                    break;
                case "/": s3 = "/";
                    double result4 = divValues(s1, s2);
                    System.out.println("The answer is: " + result4);
                    break;
                default:
                    System.out.println("Unrecognized Operator");
            }
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }
    static String getInput(String prompt){
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();

    }  static double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
   }
         static double subValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 - d2;
        return result;
    }
         static double multValues (String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 * d2;
        return result;
    }
         static double divValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 / d2;
        return result;
    }
}
