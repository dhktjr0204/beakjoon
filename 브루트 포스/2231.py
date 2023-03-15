n=int(input())

for i in range(1,n+1):
    result=0
    num=map(int, str(i))
    result=i+sum(num)
    if result==n:
        print(i)
        break
    if i==n:
        print(0)