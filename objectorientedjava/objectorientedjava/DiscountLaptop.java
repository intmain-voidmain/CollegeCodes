package objectorientedjava;

import java.util.Scanner;

class Laptop {
    String name;
    double price;
    double dis;
    double amt;

    Laptop(String n,double p)
    {
        name=n;
        price=p;
    }

    void insertdetails()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name of laptop: ");
        name = sc.nextLine();
        System.out.println("Enter price of laptop: ");
        price = sc.nextDouble();
    }

    void computeDiscount()
    {
        if (price<=25000) {
            amt=price-(0.05*price);
        } else if(price>=25001 && price<=50000) {
            amt=price-(0.075*price);
        } else if(price>=50001 && price<=100000) {
            amt=price-(0.105*price);
        } else if(price>100000) {
            amt=price-(0.15*price);
        }
    }

    void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Amount: "+amt);
    }
    
}
public class DiscountLaptop{
    public static void main(String[] args) {
        Laptop dl =new Laptop("Lenovo", 25000);
        dl.insertdetails();
        dl.computeDiscount();
        dl.show();
    }
}

