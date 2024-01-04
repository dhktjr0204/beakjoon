def solution(arr):
    stack=[arr[0]]
    for i in range(1,len(arr)):
        if arr[i]!=arr[i-1]:
            stack.append(arr[i])
    return stack

print(solution([1,1,3,3,0,1,1]))