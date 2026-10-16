import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args){
        int num;
        Scanner input =  new  Scanner(System.in);
        System.out.println("enter a digit");
        num = input.nextInt();
     
        if(num > 0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        input.close();

        
    }
    
}
