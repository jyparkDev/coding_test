n = int(input())

drink = list(map(float, input().split()))

drink.sort()

while len(drink) > 1:
    drink[-1] = drink[-1] + (drink[-2] / 2)
    drink.pop(-2)

print(drink[0])