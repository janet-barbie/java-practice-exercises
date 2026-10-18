import java.util.Arrays;
public class Copy {
    public static void main(String[] args){
        int[]x = {11,12,13,114,15};
        int[]y = Arrays.copyOf(x, 5);
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }

    }
    
}
