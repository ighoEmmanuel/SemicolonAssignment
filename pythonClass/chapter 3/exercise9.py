number = int(input("Enter 5 digits number:"))
reminder = number // 10000
num2 = number % 10000
reminder2 = num2 // 1000
num3 = num2 % 1000
reminder3 = num3 // 100
num4 = num3 % 100
reminder4 = num4 // 10
num5 = num4 % 10

print(f"{reminder} {reminder2} {reminder3} {reminder4} {num5}")