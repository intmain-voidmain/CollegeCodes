class Node:
    def __init__(self,data=None):
        self.data = data
        self.next = None


class SLinkedList:
    def __init__(self):
        self.head = None

    def listprint(self):
        ptr = self.head
        while ptr is not None:
            print(ptr.data)
            ptr = ptr.next

    def atBegining(self, newdata):
        newnode = Node(newdata)
        newnode.next = self.head
        self.head = newnode

    def atEnd(self, newdata):
        newnode = Node(newdata)
        ptr = self.head
        while ptr.next is not None:
            ptr = ptr.next
        ptr.next = newnode

    def removeNode(self, rmkey):
        headVal = self.head
        if headVal is not None:
            if headVal.data == rmkey:
                self.head = headVal.next
                headVal = None
        while headVal is not None:
            if headVal.data == rmkey:
                break
            prev = headVal
            headVal = headVal.next
        if headVal == None:
            return
        prev.next = headVal.next
        headVal = None


Slist = SLinkedList()
Slist.head = Node('Mon')
e2 = Node('Tue')
e3 = Node('Wed')
Slist.head.next = e2
e2.next = e3
Slist.atBegining('Sun')
Slist.atEnd('Thu')
Slist.removeNode('Tue')
Slist.listprint()

