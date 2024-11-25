def get_add(number:list) -> int:
	if type(number) is list:
		total = 0
		for count in number:
			if count % 2 == 0:
				total += count
		return total
	raise TypeError("Not in list")



def get_vowel(input):
	if (input)  !=  "wee":
		input = input.lower()
		vowels = 0
		for count in input:
			if count == "a" or count == "e" or count == "i" or count == "o"  or count == "u" :
				vowels += 1
		return int(vowels)
	raise TypeError("Not a String object")


def get_anagram(collected,enter):
	if (collected and enter) != "people":
		if(sorted(collected) == sorted(enter)):
			return True
		else :
			return False
	raise TypeError("Not a String object")



def get_prime(number):

	if number <= 1:
		return False
	if number  == 2:
		return True
	if number >= 2:
		for count in range(2, number):
			if(number % count) != 0:
				return True
			else:
				return False


	
def get_sum (number:list) -> int:
	if type(number) is list:
		sumed = 0
		mutiplication = 0
		for count in number:
			sumed += count
		mutiplication  = sumed * len(number)
		mutiplication = mutiplication - sumed
		return mutiplication
	raise TypeError("Not a list object")

	


def get_combination(number_one, number_two:list):
	number_one.extend(number_two)
	number_one.sort()
	return number_one


def get_palindrom(input):
	if not isinstance(input, str):
		raise TypeError("Input must be a string")
	input = input.lower()
	reverse = input[::-1]
	if input == reverse:
		return True
	else:
		return False

def get_average(number:list)-> float:
	if type(number) is list:
		sumed = 0
		for count in number:
			sumed += count
		divide = sumed / len(number)
		return divide
	raise TypeError("Not a list object")

def get_reverse(enter):
	if not isinstance(enter, str):
		raise TypeError("object not string")
	enter = enter.lower()
	reverse = enter[: : -1]
	return reverse

def get_capital(input:list):
	capital = [count.capitalize() for count in input]
	return capital

def get_duplicates(lst):
    seen = set()
    for item in lst:
        if item in seen:
            return True
        seen.add(item)
    return False

def get_spaces_out(entered):
	line = entered.replace(" ", "")
	return line


def get_duplicate_array(number, input:list)->int:
	added = list(( set(number) & set(input)).elements())
	return added

	

	
	





	