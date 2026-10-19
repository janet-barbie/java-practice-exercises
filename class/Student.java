

public class Student {
    String name;
    int age;
    void displayInfo(){
        System.out.println("name is : "+name);
        System.out.println("age :" + age);
    }
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name ="Alice";
        student1.age = 24;

        student1.displayInfo();
    }
    
}
