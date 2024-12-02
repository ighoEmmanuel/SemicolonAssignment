#prompt user to enter number 
#collect 
#save as userInput
#create a variable to store the guessed number
#store as random_number
#create a variable to store the sum of the random_number
#store as sum_of_random_number
#determine if the userInput == sum_of_random_number
#print "True"
#else
#print "False"









import random
userInput = int(input("Guess the sum of two numbers:"))
count = 1
random_number = random.randint(1 , 100)
sum_of_random_number = random_number + random_number

if userInput == sum_of_random_number:
	print("True")
else:
	print("False")