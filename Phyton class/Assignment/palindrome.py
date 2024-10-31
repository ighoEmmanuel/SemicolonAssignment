number = int(input('Enter a 3-digit integer:'))

first = number // 100
second = number % 10 

if first == second:
  print(number , ' is a palindrome')
else:
  print(number , ' is not a palindrome')