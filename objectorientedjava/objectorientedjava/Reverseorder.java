// Write a program in java to print the elements of an array in reverse order
package objectorientedjava;

public class Reverseorder {
    public static void main(String[] args) {
        int arr[]={3,5,7,4,8,9};
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
