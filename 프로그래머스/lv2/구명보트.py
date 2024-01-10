from collections import deque

def solution(people, limit):
    people=deque(sorted(people,reverse=True))
    answer = 0
    while len(people)>1:
        if people[0]+people[-1]<=limit:
            answer+=1
            people.pop()
            people.popleft()
        else:
            answer+=1
            people.popleft()
    if people:
        answer+=1
    return answer
        
        

print(solution([70, 50, 80, 50]	,100))