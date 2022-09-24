// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i+1; j < nums.length; j++) {
//                 int sum =nums[i]+nums[j];
//                 if (sum==target) {
//                     int[] a ={i,j};
//                     return a;
//                 }
//             }
//         }
//         return null;
//     }
// }
// /**
//  * leetcode
//  */
// public class leetcode {

//     public static void main(String[] args) {
//         Solution s =new Solution();
//         int nums[] = new int[5];
//         nums[0]=2;nums[1]=7;nums[2]=11;nums[3]=15;
//         int target = 9;
//         int[] a =s.twoSum(nums,target);
//         System.out.println("["+a[0]+","+a[1]+"]");
//     }
// }

/**
 * leetcode
 */

class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int rem;
        int temp=x;
        while (x>0) {
            rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
        if (temp==sum) {
            return true;
        }
        else
            return false;

    }
}
 public class leetcode {

    public static void main(String[] args) {
        Solution s =new Solution();
        if(s.isPalindrome(-121)==true)
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not palindrome");
    }
}