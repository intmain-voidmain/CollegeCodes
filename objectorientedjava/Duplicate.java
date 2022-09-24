import java.util.Scanner;

public class Duplicate {
    Scanner sc = new Scanner(System.in);
    int n=4;
    int arr[] = new int[n];

    void input()
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }

    boolean duplicateornot()
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true; 
                }
            }
        }
        return false;
    }
        
    public static void main(String[] args) {
        
        Duplicate d = new Duplicate();
        d.input();
        System.out.println(d.duplicateornot());
    }
}
