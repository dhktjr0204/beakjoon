n=int(input())
cnt=0
while n>=0:
    if n%5==0:
        cnt+=(n//5)
        print(cnt)
        break
    n-=3
    cnt+=1
else: #while문이 거짓으로 판명 될 경우 -1을 출력한다
    print(-1)
