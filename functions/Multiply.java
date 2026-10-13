import java.util.Scanner;

public class Multiply {
    public static int product(int a, int b){
        return (a*b);

    }
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        System.out.println("enter first number");
        num1 = input.nextInt();
        System.out.println("enter the second number");
        num2 = input.nextInt();
        result=product(num1,num2);
        System.out.println("the product is: "+result);
        input.close();
    }
    
}
