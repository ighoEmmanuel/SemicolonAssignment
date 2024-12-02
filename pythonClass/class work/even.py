def get_even(number:list)-> int:
	if type(number) is list:
		total = 0
		for count in number:
			if count % 2 == 0:
				total += count
		return total
	raise TypeError("Not a list object")



def get_prime_list(number:int):
	collect = list()
	for count in range(2,number):
		if count == 2 or  count == 3:
			collect.append(count)
		if (number % count) != 0:
			if count % 2 != 0 and count % 3 != 0 and count % 5 != 0 and count % 7 != 0:
				collect.append(count)
	return collect


def total(number:list):
	sumed = 0
	for count in number:
		sumed += count
	return sumed


def _list(number):
	return (total ([count for count in range (1,number + 1)]))



def  cube(number):
	cuber = []
	for count in  number:
		holder = count ** 3
		cuber.append(holder)
	return cuber



def cube(number):
	return [count **3 for count in number]





def number_of_even(number:list):
	total = 0
	for count in number:
		if count % 2 == 0:
			total += 1
	return total


def number_of_odd(number:list):
	return sum([1 for count in number if number % 2 == 0])



def number_even(numbers:list):
	return [count % 2 == 0 for count in numbers ]


def get_capital(words:list):
	return [count.capitalize() for count in words ]



def get_mutiple(number, input):
	return [count  for count in range(number, input + 1) if  count % number == 0]



def square_odd(number:list):
	return [count ** 2 for count in number if count % 2 != 0]
print(square_odd([10, 3, 7, 1, 9, 4, 2, 8, 5, 6]))
		
	