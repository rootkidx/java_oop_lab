import java.util.Scanner;
public class Lab2_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2):");
        int in = input.nextInt();
        
        int rand = (int)(Math.random()*3);
        String player =" ";
        String com = " ";
        
        switch(in)
        {
            case 0: player = "scissor"; break;
            case 1: player = "rock"; break;
            case 2: player = "paper"; break;
        }
        switch(rand)
        {
            case 0: com = "scissor"; break;
            case 1: com = "rock"; break;
            case 2: com = "paper"; break;
        }
        
        if(in == 0 )
        {
            if(rand == 0){System.out.println("The computer is "+com+". You are "+player+". It is a draw. ");};
            if(rand == 1){System.out.println("The computer is "+com+". You are "+player+". You lose. ");};
            if(rand == 2){System.out.println("The computer is "+com+". You are "+player+". You Win. ");};  
        }
        else if(in ==1 )
        {
            if(rand == 0){System.out.println("The computer is "+com+". You are "+player+". You Win. ");};
            if(rand == 1){System.out.println("The computer is "+com+". You are "+player+". It is a draw. ");};
            if(rand == 2){System.out.println("The computer is "+com+". You are "+player+". You lose. ");}; 
            
        }
        else if(in ==2 )
        {
            if(rand == 0){System.out.println("The computer is "+com+". You are "+player+". You lose. ");};
            if(rand == 1){System.out.println("The computer is "+com+". You are "+player+". You Win. ");};
            if(rand == 2){System.out.println("The computer is "+com+". You are "+player+". It is a draw. ");}; 
            
        }
       
    }
    
}
