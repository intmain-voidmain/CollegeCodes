from typing import List


class Solution:
    def containsnearbyduplicate(self, nums: List[int], k: int) -> bool:
        d = {}
        for i,n in enumerate(nums):
            if n in d and abs(i-d[n]) <= k:
                return True
            d[n] = i
        return False


sol = Solution()
print(sol.containsnearbyduplicate([1, 2, 3, 1], 3))