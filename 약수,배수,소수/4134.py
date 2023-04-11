n=int(input())
def is_prime(num):
    if num==2:
        return True
    if num==1 or num==0:
        return False
    for i in range(2,int(num**0.5)+1):
        if num%i==0:
            return False
    return True

result=[]
for i in range(n):
    m=int(input())
    num=m
    while True:
        if is_prime(num):
            result.append(num)
            break
        num+=1
    
for i in result:
    print(i)
