import sys

def possible(answer):
    for x,y,stuff in answer:
        #기둥인 경우
        if stuff==0:
            #바닥 위, 보의 한쪽 끝부분 위 혹은 다른 기둥 위라면 정상
            if y==0 or [x-1,y,1] in answer or [x,y,1] in answer or [x,y-1,0] in answer:
                continue
            return False
        elif stuff==1:
            #한쪽 끝부분이 기둥위, 양쪽 끝부분이 다른 보와 동시에 연결
            if [x,y-1,0] in answer or [x+1,y-1,0] in answer or ([x-1,y,1] in answer and [x+1,y,1] in answer):
                continue
            return False
    return True


def solution(n,build_frame):
    answer=[]
    for frame in build_frame:
        x,y,stuff,operate=frame
        #삭제하는 경우
        if operate==0:
            answer.remove([x,y,stuff])
            if not possible(answer):
                answer.append([x,y,stuff])
        if operate==1:
            answer.append([x,y,stuff])
            if not possible(answer):
                answer.remove([x,y,stuff])
    return sorted(answer)

n=5
build_frame=[[1,0,0,1],[1,1,1,1],[2,1,0,1],[2,2,1,1],[5,0,0,1],[5,1,0,1],[4,2,1,1],[3,2,1,1]]
print(solution(n,build_frame))