def get_square(number:int):
	return [count ** 2 for count in range(1, number + 1)]



def get_largest(number:list):
	return[count for count in number if count > 10]

print(get_largest([1, 5, 12, 15, 8]))

def get_bool(input:list)-> bool:
	return[True if words == words[::-1] else False for words in input]

print(get_bool(['madam','apple','racecar']))


def get_int(input):
	return[int(count) for count in input if count.isdigit()]

print(get_int("aydv12hdy456jjh7"))

