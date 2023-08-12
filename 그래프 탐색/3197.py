import sys
from collections import deque

n,m=map(int, sys.stdin.readline().split())
lake=[]
swan=[]
water=deque()

dy=(-1,0,1,0)
dx=(0,-1,0,1)

def find_swan(lake, visited, queue):
    next_queue=deque()
    while queue:
        y,x=queue.popleft()
        #현재 백조 위치가 또 다른 백조 위치와 같을때 True리턴
        if y==swan[1][0] and x==swan[1][1]:
            return True, None
        
        #백조가 이동할 수 있는 좌표 찾기
        for i in range(4):
            ny=y+dy[i]
            nx=x+dx[i]
            #좌표이동했을때 범위가 넘어간 경우
            if not 0<=ny<n or not 0<=nx<m:
                continue
            #좌표 상하좌우 중 방문한 곳이 있으면 넘어간다.
            if visited[ny][nx]:
                continue
            #방문하지않았고 얼음이라면, 아직 이동할 수 없으니 next_queue에 현재좌표 넣는다.
            if lake[ny][nx]=='X':
                next_queue.append((ny,nx))
            #방문하지않았는데 물이라면 이동할 수 있으니 좌표를 넣어준다.
            else:
                queue.append((ny,nx))
            visited[ny][nx]=True
    #백조가 서로 만나지 않았으니 False, next_queue
    return False, next_queue

def melt_ice(water,lake):
    next_water=deque()
    #현재 물상태인 애들 상하좌우 다 물로 바꿔줌
    while water:
        y,x=water.popleft()
        for i in range(4):
            ny=y+dy[i]
            nx=x+dx[i]
            if not 0<=ny<n or not 0<=nx<m:
                continue
            #현재 물이 있는 위치에서  상하좌우에 얼음이 있다면
            if lake[ny][nx]=='X':
                #물이 될 예정이므로 좌표 넣어줌
                next_water.append((ny,nx))
                #강 상태 바꿔줌
                lake[ny][nx]='.'

    return next_water

for i in range(n):
    #처음 강 상태 한줄씩 가져오기
    current_lake=list(sys.stdin.readline().rstrip())

    for c,v in enumerate(current_lake):
        if v=='.' or v=='L':
            #백조도 물로 취급한다. 만약 현재 강 상태가 물이라면 좌표정보를 넣음
            water.append((i,c))
        if v=='L':
            #백조 좌표 넣음
            swan.append((i,c))
    #처음 강 상태 전부 강에 넣음
    lake.append(current_lake)

day=-1
visited=[[False for _ in range(m)] for _ in range(n)]
queue=deque()
#처음 백조 좌표
y,x=swan[0][0], swan[0][1]
queue.append((y,x))
#백조 처음 있었던 자리 visited상태 만들기
visited[y][x]=True

while True:
    day+=1
    found,next_queue=find_swan(lake,visited,queue)
    if found:
        break
    water=melt_ice(water,lake)
    queue=next_queue

print(day)