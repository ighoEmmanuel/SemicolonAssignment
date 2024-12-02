#prompt user to enter number three times 
#collect
#store each of them as first_number, second_number,third_number
#if first_number < second_number and second_number < third_number
#display first_number,second_number,third_number
#if first_number > second_number and first_number < third_number
#display second_number,first_number,third_number
#if first_number < second_number and first_number > third_number
#display third_number,first_number,second_number
#if first_number == second_number and first_number == third_number
#display third_number,first_number,second_number
#if first_number > second_number and second_number > third_number
#display third_number,second_number,first_number







first_number = int(input("Enter first number:"))
second_number = int(input("Enter second number:"))
third_number = int(input("Enter third number:"))

if first_number < second_number and second_number < third_number:
	print(f"{first_number},{second_number},{third_number}")

if first_number > second_number and first_number < third_number:
	print(f"{second_number},{first_number},{third_number}")

if first_number < second_number and first_number > third_number:
	print(f"{third_number},{first_number},{second_number}")

if first_number == second_number and first_number == third_number:
	print(f"{third_number},{first_number},{second_number}")

if first_number > second_number and second_number > third_number:
	print(f"{third_number},{second_number},{first_number}")
