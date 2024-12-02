#create a variabe to store the number of fails
#store as failed 
#create a variable for the total number of question
#store as total
#create a variable for the "-" sign and store as sign
#create a varible for the numbers of passed 
#store as passed
#prompt user to enter number answer ten times
#store the answer in a variable called response
#create a variable that store the correct answer and call it answer
#if answer == response pass should be added by one else failed should be add by one
#display the number of failed/ total and pass






import random
total = 10
passed = 0
failed = 0
sign = "-"
for count in range(10):
	random_number_one = random.randint(1, 100)
	random_number_two = random.randint(1, 100)
	response = int(input(f"{random_number_one} {sign} {random_number_two}:"))
	answer = random_number_one - random_number_two
	if response == answer:
				passed += 1
	else:
				failed += 1			
print (f"you passed {passed}/{total}  and failed {total - passed}/{total}")

	

