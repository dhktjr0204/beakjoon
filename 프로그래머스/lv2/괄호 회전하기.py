from collections import deque

def solution(s):
    s=deque(s)
    stack=[]
    cnt=0
    for _ in range(len(s)):
        s.append(s.popleft())
        flag=True
        for i in s:
            if i=='{':
                stack.append('{')
            elif i=='(':
                stack.append('(')
            elif i=='[':
                stack.append('[')
            elif i=='}':
                if not stack or stack[-1]!='{':
                    flag=False
                    break
                stack.pop()
            elif i==']':
                if not stack or stack[-1]!='[':
                    flag=False
                    break
                stack.pop()
            elif i==')':
                if not stack or stack[-1]!='(':
                    flag=False
                    break
                stack.pop()
        if stack:
            break
        if flag:
            cnt+=1


    return cnt

print(solution("}]()[{"))