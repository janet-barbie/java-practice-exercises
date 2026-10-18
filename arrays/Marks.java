import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];   
        String name;

        int passed_students = 0;
        int failed_students = 0;
     
        int[] total = new int[5];
        float[] percentage = new float[5];

        float  perce=0;

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            System.out.println("enter a name for a student");
            name = input.next();
            System.out.println("enter marks for this student :");
            for (int j = 0; j < 5; j++) {

                marks[j] = input.nextInt();
                sum += marks[j];

            }
            
            total[i] = sum;
            System.out.println("total for student is " + total[i]);
    
            System.out.println(sum);
            perce = (sum/500.0f)*100;
            System.out.println(perce);

            percentage[i] = perce;
            System.out.println("percentage for student is " + percentage[i]);
            if(perce >=50){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }
        for (int i = 0; i < 5; i++) {

        if (percentage[i] >= 50) {
        passed_students++;
        } else {
        failed_students++;
        }

        }
        System.out.println("The number of students who passed is " +passed_students);
        System.out.println("The number of students who failed is " +failed_students);
        input.close();

    }

}
