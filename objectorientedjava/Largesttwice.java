import java.util.Scanner;

public class Largesttwice {
    int n=4,index;
    int nums[] = new int[n];

    void input()
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
    }
    int calculate()
    {
        int max=0;
    int secondMax=0;
    index =-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            secondMax=max;
            max=nums[i];
            index=i;
        }
        else if(nums[i]<max && nums[i]>secondMax)
            secondMax=nums[i];
    }
    if((max/2)>=secondMax)
        return index;
    else
        return -1;
    }
    public static void main(String[] args) {
        Largesttwice lt = new Largesttwice();
        lt.input();
        if (lt.calculate()>-1)
        {
            System.out.println(lt.index);
        }
        else 
        {
            System.out.println(-1);
        }
        
        
    }
}
