def solution(elements):
    res=set()
    for i in range(len(elements)):
        sum=elements[i]
        res.add(sum)
        for j in range(i+1, len(elements)+i):
            sum+=elements[j%len(elements)]
            res.add(sum)
    return len(res)

print(solution([7,9,1,1,4]))