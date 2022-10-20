def calculate(arr,rats,unit,n):
    totalfood = rats*unit
    sum1=0
    for i in range(n):
        sum1+=arr[i]
        if (sum1 >= totalfood):
            break
    return i+1

print(calculate([2,8,3,5,7,4,1,2],7,2,8))