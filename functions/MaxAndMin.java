

public class MaxAndMin {
    static int  maximum(int[]numbers){
        int max = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]> max){
                max = numbers[i];

            }
        }
        return max;
    
    }
    static int minimum(int[]numbers){
        int min = numbers[0];
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]< min){
                min = numbers[i];

            }
        }
        return min;
    }
    public static void main(String[]args){
        int[] digits = {10,20,30,1,5};
        int highValue = maximum(digits);
        System.out.println("highest value is : "+ highValue);
        int lowValue = minimum(digits);
        System.out.println("lowest value is : "+ lowValue);
     
    }
    
}
