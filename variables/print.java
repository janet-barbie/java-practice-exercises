import java.util.Scanner;
public class print {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a , b;
        char letter;
        String word;
        float c;
        boolean active = true;
        System.out.println("enter the first digit without a decimal point");
        a = input.nextInt();
        System.out.println("enter the second digit without a decimal point");
        b = input.nextInt();
        System.out.println("enter a digit with a decimal point");
        c = input.nextFloat();
        System.out.println("Enter a character");
        letter = input.next().charAt(0);
        System.out.println("enter a string");
        word = input.next();

        System.out.println(" first digit is : " + a);
        System.out.println(" second digit is : " + b);
        System.out.println(" digit with decimal points is : " + c);
        System.out.println(" character is  : " + letter);
        System.out.println(" the string is  : " + word);
        System.out.println("the status is " + active );
        input.close();
        


    }
    
}
