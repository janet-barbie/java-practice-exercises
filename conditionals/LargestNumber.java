import java.util.Scanner;

public class LargestNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a program that checks the largest of 2 numbers");
        System.out.println("-----------------------------------------------");
        double num1,num2;
        System.out.println("enter the first number");
        num1= scanner.nextDouble();
        System.out.println("enter the second number");
        num2 = scanner.nextDouble();
        if(num1>num2){
            System.out.println("the largest is "+num1);
        }
        else if(num2>num1){
            System.out.println("the largest is "+num2);
        }else{
            System.out.println("the numbers are equal");
        }



        scanner.close();
    }
    
}
