import java.util.Scanner;

public class EvenOrOdd {
    public  static void main(String[] args){
    int num;
    Scanner input = new Scanner(System.in);
    System.out.println("enter a digit");
    num = input.nextInt();
    if(num %2==0){
        System.out.println("even number");
    }else{
        System.out.println("odd number");
    }


    }
    

    
}
