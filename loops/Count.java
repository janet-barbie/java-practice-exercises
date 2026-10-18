import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter a non-negative number");
        x = input.nextInt();
        if(x<0){
            System.out.println("invalid input");
            return;
        }
        //zero has exactly one digit
        if(x == 0){
            System.out.println(1);
            
        }
        int count=0;
        while(x>0){
            x = x/10; // drops the last digit
            count++;//adds to the count
        }
            
        System.out.println(count);
        }

    }
    

