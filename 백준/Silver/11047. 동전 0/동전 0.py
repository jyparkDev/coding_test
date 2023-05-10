import sys

n, k = map(int, input().split())
result = 0
money = list()

for _ in range(n):
    money.append(int(sys.stdin.readline().rstrip()))

for i in range(n - 1, -1, -1):
    result += int(k / money[i])
    k %= money[i]

print(result)
