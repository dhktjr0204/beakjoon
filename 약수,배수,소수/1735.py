import math
a1,b1=map(int, input().split())
a2,b2=map(int, input().split())

gcd=math.gcd(b1,b2)
lcm=b1*b2//gcd
up=a1*lcm//b1+a2*lcm//b2
gcd1=math.gcd(up,lcm)
print(up//gcd1, lcm//gcd1)
