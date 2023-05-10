n = int(input())
result = 0
if n < 5:
    if n % 2 == 0 : result = n //2
    else: result = -1
elif n % 5 == 0:
    result = n // 5
elif (n % 5) % 2 == 0:
    result += n // 5
    n = n - (5 * result)
    result += n // 2
else:
    result += (n // 5) - 1
    n = n - (5 * result)
    result += n//2

print(result)

