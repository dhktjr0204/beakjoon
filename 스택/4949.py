while True:
    str=input()
    if str=='.':
        break
    stack=[]
    for i in str:
        if i=='[':
            stack.append(i)
        elif i=='(':
            stack.append(i)
        elif i==']':
            if stack:
                if stack.pop()=='[':
                    continue
                else:
                     print("no")
                     break
            else:
                print("no")
                break
        elif i==')':
            if stack:
                if stack.pop()=='(':
                    continue
                else:
                     print("no")
                     break
            else:
                print("no")
                break
    else:
        if not stack:
            print("yes")
        else:
            print("no")

