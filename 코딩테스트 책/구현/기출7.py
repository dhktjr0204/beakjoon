import sys

n=sys.stdin.readline().rstrip()

A=0
B=0
half=len(n)//2
for i in range(half):
    A+=int(n[i])
    B+=int(n[i+half])

if A==B:
    print("LUCKY")
else:
    print("READY")