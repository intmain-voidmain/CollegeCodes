# -*- coding: utf-8 -*-
"""
Created on Sun Jul 31 21:31:35 2022

@author: USER
"""


class ListNode:
    def __init__(self, data, next = None):
        self.val = data
        self.next = next


def make_list(elements):
    head = ListNode(elements[0])
    for element in elements[1:]:
        ptr = head
        while ptr.next:
            ptr = ptr.next
        ptr.next = ListNode(element)
    return head


def print_list(head):
    ptr = head
    print('[',end="")
    while ptr:
        print(ptr.val,end=",")
        ptr = ptr.next
    print(']')

    
class Solution:
    def addTwoNumbers(self,l1:ListNode,l2:ListNode)->ListNode:
        head = None
        temp = None
        c = 0
        while l1 or l2:
            if not l1:
                a=0
            else:
                a=l1.val
            if not l2:
                b=0
            else:
                b=l2.val
            n = a+b+c
            c=1 if n>9 else 0
            node = ListNode(n%10)
            if not head:
                head = node
                temp = node
            else:
                head.next = node
                head = node
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        if c:
            node = ListNode(1)
            head.next = node
        return temp

        
obj1 = Solution()
l1 = make_list([0,2,1])
l2 = make_list([0,3,2])
print_list(obj1.addTwoNumbers(l1,l2))
            
        