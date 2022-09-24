package java_assignment;
/**
 * Sorting
 */
class Sorting {
    void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp=0;
                if (arr[j]>arr[i]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }           
            }
                
        }
        System.out.println("Here is the array sorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class ques3 {
    public static void main(String[] args) {
        int arr[]={10,30,20,5,60,4};
        Sorting s = new Sorting();
        s.sort(arr);
    }
}
