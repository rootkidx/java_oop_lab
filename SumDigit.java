import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0-1000 : ");
        int num = input.nextInt();
        
        if(num <0 || num> 1000)
        {
            System.out.println("Error");
        }
        else
        {
            int mod = num%10 ;
            num = num/10;
            int mod2 = num%10;
            num = num /10;
            int mod3 = num%10;
            
            int sum = mod+mod2+mod3;
            System.out.println("The sum of the digits is"+" "+sum);
        }
        
    }
}
