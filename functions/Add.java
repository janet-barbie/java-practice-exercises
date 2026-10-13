import java.util.Scanner;

public class Add {
    public static void add(int a, int b){
        int sum = a+b;
        System.out.println("sum is "+sum);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter first number");
        num1 = input.nextInt();
        System.out.println("enter the second number");
        num2 = input.nextInt();
        add(num1,num2);
        input.close();
    }
    
}
