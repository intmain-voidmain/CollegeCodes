def sumofsecond(nums):
    evenlist = []
    oddlist = []
    for i in range(len(nums)):
        if (i%2==0):
            evenlist.append(nums[i])
        else:
            oddlist.append(nums[i])
    evenlist.sort()
    oddlist.sort()
    return evenlist[-2]+oddlist[1]
        
        
print(sumofsecond([3,2,5,4,2,8]))