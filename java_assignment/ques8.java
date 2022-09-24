package java_assignment;

import java.util.Scanner;

class Laptop{
    String name;
    double price;
    double dis;
    double amt;
    Laptop(String n,double p){
        name=n;
        price=p;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details: ");
        System.out.println("Name: ");name=sc.nextLine();
        System.out.println("Price: ");price=sc.nextDouble();
    }
    void compute(){
        if (price <= 25000) {
            dis=5;
            amt = (price-(price*0.05));
        }
        else if (price>=25001 && price<=50000) {
                dis=7.5;
                amt = (price-(price*0.075));
            }
        else if (price>=50001 && price<=100000) {
                dis=10.5;
                amt = (price-(price*0.105));
            }
        else if (price>100000) {
                dis=15;
                amt = (price-(price*0.15));
            }
        else{
            System.out.println("No such product");
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Discount: "+dis);
        System.out.println("Amount: "+amt);
    }
}
public class ques8 {
    public static void main(String[] args) {
        Laptop l = new Laptop("Dell", 25000);
        l.accept();
        l.compute();
        l.display();
    }
}
