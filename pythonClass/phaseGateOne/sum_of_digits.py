#prompt user to enter number between 0
#collect
#store as user_input
#caculate the userInput // 1000 
#store in varaible called first_number
#caculate the userInput % 1000
#store in a variable called first_reminder
#caculate the first_reminder // 100
#store in a variable called  second_number
#caculate the first_reminder % 100
#store in a variable called  second_reminder
#caculate the second_reminder // 10
# store in a variable called third_number
#caculate the second_reminder % 10
# store in a variable called third_reminder
#determine first_number + second_number + third_number + third_reminder
#store in a varaible called sum_of_numbers
#display sum_of_numbers



user_input = int(input("Enter number between 0 - 1000:"))
first_number = user_input // 1000
first_reminder = user_input % 1000
second_number = first_reminder // 100
second_reminder = first_reminder % 100
third_number = second_reminder // 10
third_reminder = second_reminder % 10
sum_of_numbers = first_number + second_number + third_number + third_reminder
print(sum_of_numbers)