def solution(sizes):
    for i in sizes:
        i.sort()
    answer=max(sizes,key=lambda x: x[0])[0]*max(sizes,key=lambda x: x[1])[1]
    return answer

print(solution([[60, 50], [30, 70], [60, 30], [80, 40]]))