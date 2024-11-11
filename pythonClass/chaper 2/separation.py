number = int(input("Enter 5-digit numbers:"))
number1 = number // 10000
reminder1 = number % 10000
number2 = reminder1 // 1000
reminder2 = reminder1 % 1000
number3 = reminder2 // 100
reminder3 = reminder2 % 100
number4 = reminder3 // 10
reminder4 = reminder3 % 10 

print(f"{number1} {number2} {number3} {number4} {reminder4}  ")