number = int(input('Enter a number between 0 and 1000:'))

num1 = number // 100
reminder = number % 100
num2 = reminder // 10
num3 = reminder % 10
sum = num1 + num2 + num3
print('The sum of the digits is ', sum)