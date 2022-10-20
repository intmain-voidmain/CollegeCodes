def noofInteger(arr):
    dup = []
    for i in arr:
        if i not in dup:
            dup.append(i)
            print(f'{i} occurs {arr.count(i)} times')
noofInteger([1,2,3,3,4,1,4,5,1,2])       