N,M=map(int, input().split())

S=[]
for _ in range(N):
    S.append(input())
cnt=0
for _ in range(M):
    word=input()
    if word in S:
        cnt+=1

print(cnt)