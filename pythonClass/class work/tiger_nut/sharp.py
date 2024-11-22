def get_sum (number:list) -> int:
	sumed = 0
	mutiplication = 0
	for count in number:
		sumed += count
	mutiplication  = sumed * len(number)
	mutiplication = mutiplication - sumed
	return mutiplication

print(get_sum([1, 2, 3]))
	


def get_merge(number_one, number_two:list):
	answer = len(number_one) + len(number_two)
	sorted(answer)
	return answer

print(get_merge([1,2,4],[3,5,6]))