from itertools import combinations

def solution(number):
    combi_list=list(combinations(number,3))        
    answer = 0
    for i in combi_list:
        if sum(i)==0:
            answer+=1
    return answer

print(solution([-2, 3, 0, 2, -5]))