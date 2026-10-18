import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int i ;
        i = input.nextInt();
        for(int j=1;j<=12;j++){
            System.out.println( i +"*"+j +"="+ i*j);
        }
        input.close();
        

    }
    
}
