import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int y,factorial=1;
        System.out.println("Enter a non-negative integer");
        y = input.nextInt();
        if(y<0){
            System.out.println("invalid input");
            input.close();
            return;
        }
        for(int i = y;i>1;i--){
            factorial = (factorial * i);

        }
        System.out.println(factorial);
        input.close();


    }
    
}
