package java_assignment;

import java.util.Scanner;

class Account{
    int acno; float bal;
    Account(int a,int b){
        acno=a;
        bal=b;
    }
    void withdraw(int w){
        bal=bal-w;
    }
    void deposit(int d){
        bal=bal+d;
    }
}

class Calculate extends Account{
    int r,t;
    float si,amt;
    Calculate(int a,int b){
        super(a, b);
    }
    void accept(int x,int y){
        r=x;
        t=y;
        amt=0;
    }
    void compute(){
        si = ((bal*r*t)/100);
        amt=amt+si;
    }
    void display(){
        System.out.println("Account_no     Balance     Interest      Amount");
        System.out.println("    "+acno+"            "+bal+"      "+si+"       "+amt);
    }

}

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate cal = new Calculate(1, 1000);
        char ch;
        System.out.println("Enter your choice (d for deposit || w for withdraw): ");
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'd':
                cal.deposit(500);
                break;
            case 'w':
                cal.withdraw(400);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
        cal.accept(7, 6);
        cal.compute();
        cal.display();
    }
}
