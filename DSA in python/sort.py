# def sortedSquareArray(array):
#     new_array=[0]*len(array)
#     for i in range(len(array)):
#         new_array[i]=array[i]**2
#     new_array.sort()    
#     return new_array
# print(sortedSquareArray([-6,2,4,5]))    



def sortedSquareArray(array):
    new_array=[0]*len(array)
    i=0
    j=len(array)-1
    for k in reversed(range(len(array))):
        if array[i]**2>array[j]**2:
            new_array[k]=array[i]**2
            i+=1
        else:
            new_array[k]=array[j]**2    
            j-=1 
        # new_array[i]=array[i]**2
    # new_array.sort()    
    return new_array
print(sortedSquareArray([-6,2,4,5]))    

tasks =[2,3,4,5]
f={"l":tasks}
print(f["l"])


