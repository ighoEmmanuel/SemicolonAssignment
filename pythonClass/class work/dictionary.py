my_dict = {"name":"Alice", "age": 25, "city":"New York"}

#print(my_dict)

del my_dict["city"]
#print(my_dict)

my_dict["city"] = "Lagos"

#print(my_dict)

#print(my_dict.get("salary"))# the function get() will convert the error that wil occur to none

#print(my_dict.get("salary", "Not available"))# for this one  it will just print it out 

my_dict["Schol"] = "Semi colon" # this is use to add to the dicitionary 

#print(my_dict)

#for key in my_dict: # when you iterate through the key you will get the keys in the dictionary 
#	print(key)

#for value in my_dict.values(): # the function .value() helps to get the value
#	print(value)

#for key,value in my_dict.items(): # this is used to get the value and key together
#	print(f"{key}: {value}")

squared = { x: x ** 2 for x in range(1, 11) if x % 2 == 0} 
print(squared)

nested_dict = {
"person1":{"name": "Alice","age": 25},
"person2": {"name": "Bod","age":30}
}
nested_dict["person1"]["city"] = "New York"
print(nested_dict["person1"])