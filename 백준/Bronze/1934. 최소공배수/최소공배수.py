import math
T = int(input())
for i in range(T):
    a , b = map(int,input().split())
    g = math.gcd(b,a)
    print((a*b)//g)