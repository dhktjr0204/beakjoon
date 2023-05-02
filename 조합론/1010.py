n=int(input())

bridge=[]
def factorial(n):
    if n==0 or n==1:
        return 1
    else:
        return factorial(n-1)*n

for i in range(n):
    a,b=map(int, input().split())
    bridge.append(factorial(b)//(factorial(a)*factorial(b-a)))

for i in bridge:
    print(i)