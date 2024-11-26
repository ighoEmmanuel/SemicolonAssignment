def get_largest(number:list):
	if type(number) is list:
		largest = number[0]
		for count in number:
			if(count > largest):
				largest = count 
		return largest	
	raise TypeError("Not a list objest")


def get_reverse(number:list):
	if type(number) is list:
		holder = list()
		for count in number:
			holder = number[: :-1]
		return holder
	raise TypeError('Not a list object')
		



def get_element(numbers:list, number:int):
	if type(numbers) is list and type(number) is int:
		for count in numbers:
			if count == number:
				return True
		
		return False
	raise TypeError
				

def running_total(numbers):
	if type(numbers) is list:
		total = 0
		running_totals = []  
		for num in numbers:
			total += num
			running_totals.append(total)
		return running_totals  
	raise TypeError("Not  a list object")

def get_palindrome(input):
	if isinstance(input, str):
		input = input.lower()
		reverse = input[: :-1]
		if input == reverse :
			return True
		return False
	raise TypeError
print( get_palindrome("Madam"))		
	
	