def binarystring(str):
    first = int(str[0])
    for i in range(1,len(str)):
        if (str[i]=='A'):
            first = first & int(str[i+1])
        elif (str[i]=='B'):
            first = first | int(str[i+1])
        elif (str[i]=='C'):
            first = first ^ int(str[i+1])
    return first

print(binarystring('0C1A1B1C1C1B0A0'))
            
    