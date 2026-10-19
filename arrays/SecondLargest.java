import java.util.Scanner;

public class SecondLargest {
    public static void main(String[]args){
        int [] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ;i< arr.length;i++){
            System.out.println("enter an element at index: " +(i+1));
            arr[i] = input.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];


            }else if(arr[i]>second_largest && arr[i]<largest){
                second_largest = arr[i];

            }
        }
        System.out.println("largest: " +largest);
        System.out.println("second largest: "+second_largest);
        input.close();

    }
    
}
