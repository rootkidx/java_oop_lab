
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds : ");
        double w = input.nextDouble();
        
        System.out.print("Enter height in inches : ");
        double h = input.nextDouble();
        
        w = w/2.20462262;
        h = h/39.3700787;
        
        double bmi = w/(h*h) ;
        
        System.out.println("BMI is" + " " + bmi);
    }
}
