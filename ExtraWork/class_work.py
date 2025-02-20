def getDict(input):
	keys = []
	values = []
	my_dict = {}
	for count in input:
		if count not in keys:
			keys.append(count)
	for key in keys:
		values.append(input.count(key))

	for key,value in zip(keys,values):
		my_dict[key] = value
		

	return my_dict

print(getDict([1,1,2,5,2,8,8,9,0,0]))