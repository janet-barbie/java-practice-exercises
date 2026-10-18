import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int y;
        System.out.println("enter a number");
        y = input.nextInt();
         if(y<0){
            System.out.println("invalid input");
            input.close();
            return;
         }
         int reversed = 0;
         while(y!=0){
            int digit = y%10;
            reversed = (reversed*10) + digit;
            y = y/10;

         }
        input.close();
        System.out.println("reversed number: "+reversed);
        
    }
}
