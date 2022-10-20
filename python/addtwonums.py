# -*- coding: utf-8 -*-
"""
Created on Sun Jul 31 22:23:00 2022

@author: USER
"""
class ListNode:
    def __init__(self,data,next=None):
        self.val = data
        self.next = next
class Solution(object):
    def addTwoNumbers(self,l1,l2):
        current1 = l1
        current2 = l2
        num1 = 0
        num2 = 0
        m = 0
        
        while current1:
            num1+=current1.val*10**m
            current1 = current1.next
            m+=1
        m = 0
        while current2:
            num2 += current1.val*10**m
            current2 = current2.next
            m+=1
        theSum = num1+num2
        ans = ListNode()
        current = ans
        while theSum!=0:
            current.val = theSum%10
            theSum = theSum//10
            if theSum!=0:
                current.next = ListNode()
                current = current.next
        return ans
        
sol = Solution()
l1 = make_list([0,2,1])
l2 = make_list([0,3,2])
print(sol.addTwoNumbers(l1,l2))