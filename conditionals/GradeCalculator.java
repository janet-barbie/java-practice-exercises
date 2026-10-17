import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        System.out.println("a program that calculates grading");
        System.out.println("----------------------------------------");
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println(" enter marks");
        marks = input.nextInt();
        if(marks < 0||marks >100){
            System.out.println("invalid marks");
            return;
        }
        if(marks >= 80){
            System.out.println("A");
        }else if(marks >=70){
            System.out.println("B");

        }else if(marks >=60){
            System.out.println("C");
        }else if(marks >= 50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        input.close();


    }
    
}
