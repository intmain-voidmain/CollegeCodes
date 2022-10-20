class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        res =1
        slow = 0
        for i in range(1,len(s)):
