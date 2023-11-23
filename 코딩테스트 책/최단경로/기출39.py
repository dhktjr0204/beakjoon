import sys
import heapq

t=int(sys.stdin.readline())
INF=int(1e9)

dx=[-1,0,1,0]
dy=[0,-1,0,1]
for _ in range(t):
    n=int(sys.stdin.readline())
    graph=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]
    distance=[[INF]*n for _ in range(n)]
    q=[(graph[0][0],0,0)]
    distance[0][0]=graph[0][0]
    while q:
        dist,x,y=heapq.heappop(q)
        if distance[x][y]<dist:
            continue
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<n:
                cost=dist+graph[nx][ny]
                if cost<distance[nx][ny]:
                    distance[nx][ny]=cost
                    heapq.heappush(q,(cost,nx,ny))
    print(distance[n-1][n-1])        
    