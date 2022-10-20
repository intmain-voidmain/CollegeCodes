# def reduceSize(a):
#     ans = ""
#     c=1
#     for i in range(len(a)-1):
#         if (a[i]==a[i+1]):
#             c+=1
#         else:
#             if c>1:
#                 ans = ans + a[i]+str(c)
#             else:
#                 ans = ans + a[i]
#             c=1
#     if(c==1):
#         ans+=a[i+1]
#     else:
#         ans+=a[i+1]+str(c)
#     print(ans)



def reduceSize(a):
    dict1 = {}
    for i in a:
        dict1[i] = a.count(i)
    ans = ""
    for i in range(len(dict1)):
        ans = ans + list(dict1.keys())[i] + str(dict1.get(list(dict1.keys())[i]))
    print(ans)

reduceSize('aabbbbeeeeffggg')