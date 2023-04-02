n,m=map(int, input().split())

listen=set()
see=set()

for _ in range(n):
    listen.add(input())

for _ in range(m):
    see.add(input())

result=sorted(list(listen & see))

print(len(result))
for i in result:
    print(i)