import java.util.Scanner;

public class Rectangle {
    double length;
    double width;
    double area(double length,double width){
        double a = length*width;
        return a;
    }
    double perimeter(double length,double width){
        double p = 2*(length+width);
        return p;
    }
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int l,w;
        System.out.println("enter length");
        l = input.nextInt();
        System.out.println("enter width");
        w = input.nextInt();
        Rectangle rectangle = new Rectangle();
        double Area = rectangle.area(l,w);
        double Perimeter = rectangle.perimeter(l,w);
        System.out.println("perimeter: "+Perimeter);
        System.out.println("area: "+Area);

        input.close();
    }

    
}
