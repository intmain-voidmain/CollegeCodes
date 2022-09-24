package objectorientedjava;

class Acccount
{
    int acno;float bal;
    Acccount(int a,int b)
    {
        acno=a;
        bal=b;
    }
    void withdraw(int w)
    {
        bal=bal-w;
    }
    void deposit(int d)
    {
        bal=bal+d;
    }
}

class Calculate extends Acccount
{
    Calculate(int a, int b) {
        super(a, b);
    }
    int r,t;
    float si,amt=0;
    void accept(int x,int y)
    {
        r=x;
        t=y;
        amt=0;
    }
    void compute()
    {
        si=(bal*r*t)/100;
        amt=amt+si;
    }
    void display()
    {
        System.out.println("Account no.: "+acno);
        System.out.println("Balance: "+bal);
        System.out.println("Interest: "+si);
        System.out.println("Amount: "+amt);
    }
}
public class Bank {
    public static void main(String[] args) {
        Calculate c =new Calculate(1,4000);
        c.withdraw(500);
        c.accept(5,5);
        c.compute();
        c.display();
    }
}
