n = int(input())
# 다음 이동 거리
km = list(map(int, input().split()))
#기름가격
price = list(map(int, input().split()))
i = oil = result = 0
j = i + 1
while i < n:
    curPrice = price[i]
    nextPrice = price[j]
    if nextPrice <= curPrice:
        totalkm = sum(km[i: j])
        result += (curPrice * totalkm)
        i = j
    j += 1
    if j == n:
        totalkm = sum(km[i:])
        result += (curPrice * totalkm)
        break

print(result)




