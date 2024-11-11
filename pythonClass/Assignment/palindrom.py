number = int(input('Enter a 3-digit integer:'))

first = number // 100
reminder = number % 100
second = reminder // 10 
third = reminder % 10 

if first == third 
  print(number , ' is a palindrome')
else:
  print(number , ' is not a palindrome')