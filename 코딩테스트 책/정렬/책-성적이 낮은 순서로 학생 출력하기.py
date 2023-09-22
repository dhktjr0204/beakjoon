import sys

n=int(sys.stdin.readline())
lst=[sys.stdin.readline().split() for _ in range(n)]
lst.sort(key=lambda x: x[1])
for i in lst:
    print(i[0] , end=' ')