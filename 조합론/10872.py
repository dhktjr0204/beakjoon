def factorial(result,num,target):
    result*=num
    if target==num:
        return result
    elif target==0:
        return 1
    else:
        return factorial(result, num+1, target)
    

num=int(input())
print(factorial(1,1,num))