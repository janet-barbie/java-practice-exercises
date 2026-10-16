import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){
        float marks;
        Scanner input = new Scanner(System.in);
        System.out.println("enter student's marks");
        marks = input.nextFloat();
        if(marks > 100||marks < 0){
            System.out.println("invalid marks");
            return;

        }
        if(marks > 50){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
    
}
