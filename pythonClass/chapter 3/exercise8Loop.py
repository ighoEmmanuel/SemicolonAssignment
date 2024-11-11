count = 1

while count <= 4:
    
    firstNumber = int(input("Enter first integer: "))
    secondNumber = int(input("Enter second integer: "))
    thirdNumber = int(input("Enter third integer: "))
    fourthNumber = int(input("Enter fourth integer: "))

    
    sum_of_numbers = firstNumber + secondNumber + thirdNumber + fourthNumber
    average = sum_of_numbers / 4
    product = firstNumber * secondNumber * thirdNumber * fourthNumber

    
    largest = max(firstNumber, secondNumber, thirdNumber, fourthNumber)
    smallest = min(firstNumber, secondNumber, thirdNumber, fourthNumber)

    print('The largest is:', largest)
    print('The smallest is:', smallest)
    print('The sum is:', sum_of_numbers)
    print('The average is:', average)
    print('The product is:', product)
    
    count += 1

    

    
