import sys

while True:
    graph=list(map(int, sys.stdin.readline().split()))

    if graph[0]==0:
        break
    stack=[]
    max_result=0

    for i, height in enumerate(graph):
        if i==0:
            continue

        if stack and stack[-1][1]>height:
            while stack:
                stack_i, stack_height=stack.pop()
                width_start=1
                if stack:
                    width_start=stack[-1][0]+1
                result=(i-width_start)*stack_height
                max_result=max(max_result,result)
                if not stack or stack[-1][1]<=height:
                    break
        if not stack or stack[-1][1]<=height:
            stack.append((i,height))
        
    while stack:
        stack_i, stack_height=stack.pop()
        width_start=1
        if stack:
            width_start=stack[-1][0]+1
        result=(graph[0]+1-width_start)*stack_height
        max_result=max(max_result,result)
    
    print(max_result)
