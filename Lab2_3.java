import java.util.Scanner;
public class Lab2_3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String min = " ";
        String mid = " ";
        String max = " ";
        
        System.out.print("Enter the first city:");
        String first = input.nextLine();
        System.out.print("Enter the second city:");
        String second = input.nextLine();
        System.out.print("Enter the third city:");
        String third = input.nextLine();
        
        char a = first.charAt(0);
        char b = second.charAt(0);
        char c = third.charAt(0);
        
       
    if (a<b && a<c)
      min=first;
    else if (a>b && a>c)
      max=first;
    else if (a>b && a<c)
      mid=first;
    else if (a<b && a>c)
      mid=first;
           
    if (b<c && b<a)
      min = second;
    else if (b>c && b>a)
      max = second;
    else if (b>c && b<a)
      mid = second;
    else if (b<c && b>a)
      mid = second;
      
    if (c<a && c<b)
      min = third;
    else if (c>a && c>b)
      max = third;
    else if (c>a && c<b)
      mid = third;
    else if (c<a && c>b)
      mid = third;
    
    System.out.println("The tree cities in alphabetical order are "+min+" "+mid+" "+max);
    }
    
}
