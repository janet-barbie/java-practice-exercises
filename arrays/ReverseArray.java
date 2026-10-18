import java.util.Scanner;

public class ReverseArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int []arr = new int[6];
        System.out.println("enter array values");
        for(int i = 0;i<arr.length;i++){
          arr[i] = input.nextInt();  

        }
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);

        }
        input.close();
    }
    
}
