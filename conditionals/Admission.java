import java.util.Scanner;

public class Admission {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age , marks;
        System.out.println("enter your age");
        age = input.nextInt();
        if(age >18){
            System.out.println("enter your marks");
            marks = input.nextInt();
            if(marks >=60){
                System.out.println("admitted");
            }else{
                System.out.println("not admitted");
            }

        }else{
            System.out.println(" below eligible age for admission");
        }
        input.close();

    }
    
}
