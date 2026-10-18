import java.util.Scanner;

public class Discount {
   public  static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int amount;
    double final_amount,discount;
    System.out.println(" enter amount");
    amount = input.nextInt();
    if(amount > 50000){
        discount = (0.1*amount);
        final_amount = discount + amount;
        System.out.println("the amount is : " + final_amount);
    }
    else{
        final_amount = amount;
        System.out.println("the amount is : " + final_amount);
    }

    input.close();
   }
    
}
