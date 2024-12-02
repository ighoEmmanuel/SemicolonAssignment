def get_square(number:int):
	return [count ** 2 for count in range(1, number + 1)]



def get_largest(number:list):
	return[count for count in number if count > 10]

def get_bool(input:list)-> bool:
	return[True if words == words[::-1] else False for words in input]



def get_int(input):
	return[int(count) for count in input if count.isdigit()]

print(get_int("aydv12hdy456jjh77FGYFIUVCSIUFGP7G2[Q09 5Y C349[C1 58TY8051TY	4 85YV 72PTYC;97T57P1F0"))

