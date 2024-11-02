count = 1


firstNumber = int(input("Enter first integer:"))
secondNumber = int(input("Enter second integer:"))
thirdNumber = int(input("Enter third integer:"))
sum = firstNumber + secondNumber + thirdNumber
average = sum / 3
product = firstNumber * secondNumber * thirdNumber

while count < 4:
    if firstNumber > secondNumber and firstNumber > thirdNumber:
        largest = firstNumber
    elif secondNumber > thirdNumber:
        largest = secondNumber
    else:
        largest = thirdNumber

    if firstNumber < secondNumber and firstNumber < thirdNumber:
        smallest = firstNumber
    elif secondNumber < thirdNumber:
        smallest = secondNumber
    else:
        smallest = thirdNumber
 
print('The largest is:', largest)
print('The smallest is:', smallest)
print("The sum is:", sum)
print("The average is:", average)
print("The product is:", product)
count += 1 
    

    
