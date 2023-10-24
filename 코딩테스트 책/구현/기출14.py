import sys
from itertools import permutations

n=12
weak=[1,5,6,10]
dist=[1,2,3,4]
def solution(n,weak,dist):
    length=len(weak)
    for i in range(length):
        weak.append(weak[i]+n)
    #투입될 친구 수의 최솟값이므로 전체 친구 수+1로 초기화
    answer=len(dist)+1
    #0부터 length-1까지의 위치를 각각 시작점으로 설정
    for start in range(length):
        for friends in list(permutations(dist,len(dist))):
            count=1
            #해당 친구가 점검할 수 있는 마지막 위치
            position=weak[start]+friends[count-1]
            for index in range(start, start+length):
                if position<weak[index]:
                    count+=1
                    if count>len(dist):
                        break
                    position=weak[index]+friends[count-1]
            answer=min(answer, count)
    if answer>len(dist):
        return -1
    return answer
print(solution(n,weak,dist))