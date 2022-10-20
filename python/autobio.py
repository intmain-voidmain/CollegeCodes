def autobio(n):
    count_digits = ''.join([str(n.count(str(i))) for i in range(len(n))])
    return count_digits==n
    

print(autobio('1210'))