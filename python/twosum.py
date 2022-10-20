from typing import List


class Solution:
    def twosum(self,arr: List[int],target: int)->List[int]:
        for i in range(0,len(arr)-1):
            for j in range(i+1,len(arr)):
                if arr[i]+arr[j]==target:
                    return i,j


if __name__=='__main__':
    s = Solution()
    print(s.twosum([3,3], 6))
