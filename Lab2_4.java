
import java.util.Scanner;

public class Lab2_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rows :");
        int rows = input.nextInt();

        if (rows < 1 || rows > 15) {
            System.out.println("Error");
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);       
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l); 
            }   
            System.out.println("");
        }
    }
}
