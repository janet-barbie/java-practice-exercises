import java.util.Scanner;

public class Guess {
    public static void main(String[]args){
        int secretNumber = 20;
        int y;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("enter your guess");
            y = input.nextInt();
            if(y<secretNumber){
                System.out.println("too low,try again");
            }else if(y>secretNumber){
                System.out.println("too high,try again");
            }else{
                System.out.println("correct guess "+secretNumber);
            }
            
        } while (secretNumber!=y);
         input.close();
    }

    
}
