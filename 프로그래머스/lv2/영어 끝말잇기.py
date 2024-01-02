def solution(n, words):
    dic={words[0]:1}
    for i in range(1,len(words)):
        if words[i][0]!=words[i-1][-1] or words[i] in dic:
            return [i%n+1,i//n+1]
    
        dic[words[i]]=1
    return [0,0]

print(solution(2,["hello", "one", "even", "never", "now", "world", "draw"]))