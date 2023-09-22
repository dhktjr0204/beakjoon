import sys

import sys

n=int(sys.stdin.readline())
num=[int(sys.stdin.readline()) for _ in range(n)]
num=sorted(num,reverse=True)
print(' '.join(map(str,num)))