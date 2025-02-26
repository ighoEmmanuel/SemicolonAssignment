def last_list_adder(array:list):
    if type(array) is list:
        number = (int("".join(map(str, array)))) + 1
        return [int(digit) for digit in str(number)]
    raise TypeError('input must be list')

print(last_list_adder([1,2,3]))
