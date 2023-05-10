import sys

n = int(input())
milk = list()

for _ in range(n):
    m = int(sys.stdin.readline().rstrip())
    milk.append(m)

milk.sort(reverse=True)
result = 0
d = n // 3
r = n % 3


for i in range(d):
    num = 3 * i
    result += sum(milk[num: num + 2])

if r > 0:
    result += sum(milk[3 * d :])

print(result)