import sys

p="()))((()"

def divide(p):
    l_count=0
    r_count=0
    for i in range(len(p)):
        if p[i]=='(':
            l_count+=1
        else:
            r_count+=1
        if l_count==r_count:
            return p[:i+1],p[i+1:]
        
def check_proper(p):
    stack=[]
    for i in p:
        if i=='(':
            stack.append(i)
        else:
            if not stack:
                return False
            stack.pop()
    return True

def solution(p):
    answer=''
    if not p:
        return answer
    u,v=divide(p)
    if check_proper(u):
        answer=u+solution(v)
    else:
        answer='('
        answer+=solution(v)
        answer+=')'
        for i in u[1:-1]:
            if i=='(':
                answer+=')'
            else:
                answer+='('
    return answer

print(solution(p))