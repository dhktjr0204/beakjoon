n=int(input())
def hanoi(n,start,end):
    result=0
    if n==1:
        print(start, end)
        return
    #n-1원판을 1->2막대로 옮김
    hanoi(n-1,start,6-start-end)
    #남은 원판 1->3으로 옮김
    print(start,end)
    #n-1원판을 2->3으로 옮김
    hanoi(n-1,6-start-end,end)

print(2**n-1)
hanoi(n,1,3)
