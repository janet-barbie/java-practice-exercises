import java.util.Scanner;

public class Search {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int []arr=new int[8];
        System.out.println("enter  numbers");
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
            

        }
        int target;
        System.out.println("enter a target value");
        target= input.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]== target){
                System.out.println("target exists at index:"+j);
                input.close();
                return ;
            }
        }
        System.out.println("target not found");


        input.close();
    }
    
}
