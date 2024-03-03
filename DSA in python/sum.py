
def sum(array,target):
    global j
    if len(array)==0:
        print("it is an empty arrray")
    else:
        for i in range(len(array)):
            for j in range(1,len(array)):
                if target == array[i]+array[j]:
                      break
                else:
                    print("not found")
        print("indexes are:",i,j)                        
sum([2,3],5)  

