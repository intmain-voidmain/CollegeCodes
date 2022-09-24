import java.util.Scanner;

public class WaterBill
{
    int liters;
    int waterBill;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        liters=sc.nextInt();
    }
    void Output()
    {
        if (liters<=100) {
            waterBill=liters*15;
        } else if (liters<=200 && liters>100) {
            waterBill=liters*14;
        } else {
            waterBill=liters*12;
        }

        System.out.println(waterBill);
    }
    public static void main(String[] args) {
        WaterBill wb = new WaterBill();
        wb.input();
        wb.Output();
    }
}