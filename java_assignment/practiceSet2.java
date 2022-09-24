import java.util.Scanner;

public class practiceSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int ch = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(ch+"*"+i+"="+ch*i);
        }
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            sum+=2*i;
        }
        System.out.println(sum);
    }
}
