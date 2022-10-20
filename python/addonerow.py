from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def addOneRow(self, root: Optional[TreeNode], val: int, depth: int) -> Optional[TreeNode]:
        def helper(node,height):
            if node is None or height > depth-1:
                return
            helper(node.left,height+1)
            if height == depth-1:
                nodeOne, nodeTwo = TreeNode(val), TreeNode(val)
                nodeOne.left = node.left
                nodeTwo.right = node.right
                node.left, node.right = nodeOne,nodeTwo
            helper(node.right,height+1)
        if depth == 1:
            node = TreeNode(val)
            node.left = root
            root = node
            return root
        helper(root,1)
        return root

sol = Solution()
print(sol.addOneRow([4,2,6,3,1,5],1,2))
