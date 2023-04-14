n=int(input())
test=[0]*n
for i in range(n):
    test[i]=int(input())

max_num=max(test)

prime=[True]*max_num
prime[1]=False

for i in range(2,int(max_num**0.5)+1):
    if prime[i]:
        for j in range(2*i,max_num,i):
            prime[j]=False


for i in test:
    cnt=0
    for j in range(2,i//2+1):
        if prime[j] and prime[i-j]:
            cnt+=1
    print(cnt)

    

