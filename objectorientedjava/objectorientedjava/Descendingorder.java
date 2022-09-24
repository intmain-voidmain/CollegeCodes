// Write a program in java to sort the elements of an array in descending order
package objectorientedjava;

public class Descendingorder {
    public static void main(String[] args) {
        int arr[]={4,6,3,7,2,1};
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>max) {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
