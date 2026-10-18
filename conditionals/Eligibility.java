import java.util.Scanner;
public class Eligibility {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age;
        age = input.nextInt();
        if(age>18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        input.close();


    }
}
