import random
userInput = int(input("Guess the sum of two numbers:"))
count = 1
random_number = random.randint(1 , 100)
sum_of_random_number = random_number + random_number

if userInput == sum_of_random_number:
	print("True")
else:
	print("False")
print(sum_of_random_number)