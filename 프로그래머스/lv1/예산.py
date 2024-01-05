def solution(d, budget):
    d.sort()
    total=0
    answer=0
    for i in range(len(d)):
        total+=d[i]
        if total<=budget:
            answer+=1
        else:
            break
    return answer

print(solution([1,3,2,5,4],9))