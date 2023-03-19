n,m=map(int, input().split())

chess=[]
cnt=[]
for _ in range(n):
    chess.append(input())

for i in range(n-7):#8*8로 잘라야되니까
    for j in range(m-7):
        w_index=0
        b_index=0
        for a in range(i, i+8):#시작 지점
            for b in range(j, j+8):
                if (a+b)%2==0:#짝수인경우
                    if chess[a][b]=='B': #짝수,홀수끼리는 다 같은 색이어야한다
                        w_index+=1
                    else:
                        b_index+=1
                else:
                    if chess[a][b]=='B':
                        b_index+=1
                    else:
                        w_index+=1
        cnt.append(w_index)
        cnt.append(b_index)
    
print(min(cnt))

