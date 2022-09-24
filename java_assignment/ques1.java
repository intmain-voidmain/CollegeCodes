package java_assignment;

class Student {
    String name;
    Student(){
        name = "Unknown";
    }
    Student(String s){
        name = s;
    }
    void display(){
        System.out.println("Name");
        System.out.println(""+name);
    }
}
public class ques1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        s1.display();
        s2.display();
    }
}
