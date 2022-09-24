package java_assignment;

import java.util.Scanner;

class Sale{
    String title,author,publication;
    double price;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title: ");title=sc.nextLine();
        System.out.println("Enter author: ");author=sc.nextLine();
        System.out.println("Enter publication: ");publication=sc.nextLine();
        System.out.println("Enter price: ");price=sc.nextDouble();
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publication: "+publication);
        System.out.println("Price: "+price);
    }
}

class Purchase extends Sale{
    int noc;
    double amount;
    void accept(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of copies: ");noc=sc.nextInt();
    }
    void calculate(){
        amount = noc*price;
    }
    void show(){
        display();
        System.out.println("Number of Copies: "+noc);
        System.out.println("Amount: "+amount);
    }
}

public class ques9 {
    public static void main(String[] args) {
        Purchase p = new Purchase();
        p.accept();
        p.calculate();
        p.show();
    }
}
