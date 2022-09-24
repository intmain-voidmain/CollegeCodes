// Write a program to print the names of students by creating a Student class.
// If no name is passed while creating an object of Student class, 
// then the name should be "Unknown", 
// otherwise the name should be equal to the String value passed 
// while creating object of Student class.

package objectorientedjava;

public class Student {
    String name;
    Student()
    {
        name="unknown";
    }
    Student(String n)
    {
        name=n;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        System.out.println("Student name: "+s1.name);
        System.out.println("Student name: "+s2.name);
    }
}
