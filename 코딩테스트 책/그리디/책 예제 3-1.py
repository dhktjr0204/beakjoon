import sys

sum=int(sys.stdin.readline())
coin=[500,100,50,10]

result=0
for i in coin:
    result+=sum//i
    sum=sum%i

print(result)