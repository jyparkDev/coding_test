n = int(input())
p = list(map(int, input().split()))

p.sort()

time = 0
m = 0
for i in p:
    m += i
    time += m

print(time)