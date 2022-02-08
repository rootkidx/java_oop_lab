import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String day= " ";
        String FutureDay = " ";
        System.out.print("Enter today's day: ");
        int NumDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int Add = input.nextInt();
        
        int Answer = (NumDay+Add)%7; 
        
        switch(NumDay)
        {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;         
        }
        switch(Answer)
        {
            case 0:
                FutureDay = "Sunday";
                break;
            case 1:
                FutureDay = "Monday";
                break;
            case 2:
                FutureDay = "Tuesday";
                break;
            case 3:
                FutureDay = "Wednesday";
                break;
            case 4:
                FutureDay = "Thursday";
                break;
            case 5:
                FutureDay = "Friday";
                break;
            case 6:
                FutureDay = "Saturday";
                break;         
        }
         System.out.println("Today is "+ day + " and the future day is "+ FutureDay );
        
    }
    
}
