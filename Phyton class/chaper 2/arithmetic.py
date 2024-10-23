num1 = int(input("Enter first integer:"))
num2 = int(input("Enter second integer:"))
num3 = int(input("Enter third integer:")) 
mutipliy = num1 * num2 * num3

add = num1 + num2 + num3
average = add / 3
smallest = num1
if num2 < smallest:
    smallest = num2
if num3 < smallest:
  smallest = num3
print("Smallest is ", smallest)
if num1 > num2 and num1 > num3:
  print("largest is ", num1)

if num2 > num3 and num2 > num1:
   print("largest is ", num2)
if num3 > num1 and num3 > num2:
  print("largest is ", num3) 
print ("The sum is ", add)
print ("The product is ", mutipliy)

print ("The average is ", average)
