def solution(arr):
    arr.remove(min(arr))
    answer=arr
    if len(answer)==0:
        answer.append(-1)
    return answer

print(solution([4,3,2,1]))