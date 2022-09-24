def moveHash(str):
    x=str.count('#')
    str = str.replace('#','')
    str = ('#'*3)+str
    print(str)
      
moveHash('Move#Hash#to#Front')
