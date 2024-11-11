number = int(input("Enter a 5-digit number: "))

digits = []


while number > 0:
    digits.insert(0 ,number % 10)
    number = number // 10


for digit in digits:
    print(digit, end=' ')

