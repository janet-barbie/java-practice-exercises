import java.util.Scanner;

public class Square {
    static int square(int num){
        int result = num * num;
        return result;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.println("enter a number");
        number = input.nextInt();
        int solution = square(number);
        System.out.println("the solution is: "+solution);
        input.close();
    }
    
}
