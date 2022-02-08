import java.util.Scanner;
public class Cramer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("input a : ");
        double a = input.nextDouble();
        
        System.out.print("input b : ");
        double b = input.nextDouble();
        
        System.out.print("input c : ");
        double c = input.nextDouble();
        
        System.out.print("input d : ");
        double d = input.nextDouble();
        
        System.out.print("input e : ");
        double e = input.nextDouble();
        
        System.out.print("input f : ");
        double f = input.nextDouble();
        
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        
        System.out.println("x = "+" "+x);
        System.out.println("y = "+" "+y);
        
    }
}
