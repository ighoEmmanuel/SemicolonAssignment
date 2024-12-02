def get_even(number:list):
	holder = list()
	if type(number) is list:
		for count in number:
			if count % 2 == 0:
				holder.append(True)
			else:
				holder.append(False)
		return holder
	raise TypeError("Not a list object")


def divide_list(numbers):
	holder = list()
	collect = list()
	if type(numbers) is list:
		if len(numbers) % 2 == 0:
			for count in numbers:
				if count <= len(numbers) // 2 :
					holder.append(count)
				if  count > len(numbers) // 2:
					collect.append(count)
		if len(numbers) % 2 != 0:
			for count in numbers:
				if count <= len(numbers) // 2 :
					holder.append(count)
				if count > len(numbers) // 2:
					collect.append(count)
		return holder,collect
	raise TypeError("Not a list object")


def rearrange_list(input:list,y:int):
	x = list()
	collect = list()
	for count in input:
		if count == y
			continue
		collect.append(y)
print(rearrange_list([1, 2, 3, 4], 3))
	
				 
		



		
	
	