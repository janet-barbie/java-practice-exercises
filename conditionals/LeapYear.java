import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int year;
        System.out.println("enter a year");
        year = input.nextInt();
        if(year % 400 == 0||year % 4 == 0&&year % 100 != 0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }

        input.close();
    }
    
}
