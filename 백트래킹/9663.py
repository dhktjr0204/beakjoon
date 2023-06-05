n=int(input())

row=[0]*n
cnt=0
def is_promised(x):
    for i in range(x):
        if row[x]==row[i] or abs(row[x]-row[i])==abs(x-i):
            return False
    return True

def N_queen(queen):
    global cnt
    if queen==n:
        cnt+=1
        return 
    else:
        for i in range(n):
            row[queen]=i
            if is_promised(queen):    
                N_queen(queen+1)

N_queen(0)
print(cnt)