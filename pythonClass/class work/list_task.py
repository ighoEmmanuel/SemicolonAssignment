def get_sum(number:list):
	return [count + count for count in number]

def get_longest(input:list):
	return [count for count in input if len(count) >= 5]


print(get_longest(["Apple", "orange","fish","ice", "lime"]))

def get_add(number):
	#return sum([int(count) for count in str(number)])
	return sum(list(map(lambda count: int(count) , str(number))))
print(get_add(123))