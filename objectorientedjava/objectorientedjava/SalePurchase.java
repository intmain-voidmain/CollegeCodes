package objectorientedjava;

import java.util.Scanner;

class Sale
{
    String title,author,pub;
    double price;

    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Title: ");title=sc.nextLine();
        System.out.println("Author: ");author=sc.nextLine();
        System.out.println("Publication: ");pub=sc.nextLine();
        System.out.println("Price: ");price=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publication: "+pub);
        System.out.println("Price: "+price);
    }
}

class Purchase extends Sale
{
    int noc;
    double amount;

    public void accept()
    {
        Scanner sc =new Scanner(System.in);
        input();
        System.out.println("No. of copies: ");noc=sc.nextInt();
    }
    public void calculate()
    {
        amount=noc*price;
    }
    public void show()
    {
        display();
        System.out.println("No. of copies: "+noc);
        System.out.println("Amount: "+amount);
    }
}
public class SalePurchase {
    public static void main(String[] args) {
        Purchase pub = new Purchase();
        pub.accept();
        pub.calculate();
        pub.show();
    }
    
}
