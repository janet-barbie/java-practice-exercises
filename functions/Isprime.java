public class Isprime {
    static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2;i<num;i++){
            if(num % i==0){
                return false;

            }
        }
        return true;

    }
    public  static void main(String[]args){
        System.out.println("is prime :" + prime(2));
        System.out.println("is prime :" + prime(1));
        System.out.println("is prime :" + prime(4));
    }
    
}
