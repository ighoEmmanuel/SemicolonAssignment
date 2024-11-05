number = int(input("Enter number:"))

reminder = number % 1000
num2 = number // 1000
reminder2 = reminder % 100
num3 = reminder // 100
reminder3 = reminder2 % 10
num4 = num3 // 10

answer = 2 * num2 + 2 * num3 + num4 * 2

print(answer)