#https://hz25.tistory.com/18
from collections import deque

board=[[0, 0, 0, 1, 1],[0, 0, 0, 1, 0],[0, 1, 0, 1, 1],[1, 1, 0, 0, 1],[0, 0, 0, 0, 0]]
def solution(board):
    answer = 0
    N=len(board)
    # 방향 벡터 (하우상좌)
    drdc = [[1, 0], [0, 1], [-1, 0], [0, -1]]
    #(행,열, 로봇이 놓인 방향, 이동횟수)
    #방향 0:세로 1:가로
    q=deque([(0,0,1,0)])
    #행,열,로봇이 놓인 방향
    visited=set([(0,0,1)])

    while q:
        r1,c1,robot_d,mv=q.popleft()
        r2,c2=r1+drdc[robot_d][0],c1+drdc[robot_d][1]

        if r2==N-1 and c2==N-1:
            return mv
        
        for i in range(4):
            nr1, nc1=r1+drdc[i][0], c1+drdc[i][1]
            nr2, nc2 = r2 + drdc[i][0], c2 + drdc[i][1]

            if 0<=nr1<N and 0<=nc1<N and 0<=nr2<N and 0<=nc2<N:
                if (nr1,nc1,robot_d) in visited or board[nr1][nc1]==1 or board[nr2][nc2]==1:
                    continue
                q.append((nr1,nc1,robot_d,mv+1))
                visited.add((nr1,nc1,robot_d))
                #robot_d가 1이면 0이되고 0이면 1이된다.
                #xor이 같으면 0 다르면 1을 출력하기 때문
                rotated_d=robot_d^1
                # 로봇 세로 + 오른쪽으로 회전, 로봇 가로 + 아래쪽으로 회전
                if robot_d + i == 1:
                    if (r1, c1, rotated_d) not in visited:
                        q.append((r1, c1, rotated_d, mv + 1))
                        visited.add((r1, c1, rotated_d))
                    if (r2, c2, rotated_d) not in visited:
                        q.append((r2, c2, rotated_d, mv + 1))
                        visited.add((r2, c2, rotated_d))
                # 로봇 세로 + 왼쪽으로 회전, 로봇 가로 + 위쪽으로 회전
                elif robot_d + i == 3:
                    if (nr1, nc1, rotated_d) not in visited:
                        q.append((nr1, nc1, rotated_d, mv + 1))
                        visited.add((nr1, nc1, rotated_d))
                    if (nr2, nc2, rotated_d) not in visited:
                        q.append((nr2, nc2, rotated_d, mv + 1))
                        visited.add((nr2, nc2, rotated_d))

    return -1

print(solution(board))