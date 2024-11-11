firstNumber = int(input("Enter first integer:"))
secondNumber = int(input("Enter second integer:"))
thirdNumber = int(input("Enter third integer:"))
sum = firstNumber + secondNumber + thirdNumber
average = sum / 3
product = firstNumber * secondNumber * thirdNumber

if firstNumber > secondNumber and firstNumber > thirdNumber:
  print(firstNumber ," is the largest") 
elif secondNumber > thirdNumber and secondNumber < firstNumber:
  print(secondNumber ," is the largest") 
elif thirdNumber < firstNumber and thirdNumber < secondNumber:
  print(firstNumber ," is the largest") 





if firstNumber < secondNumber and firstNumber < thirdNumber:
 print(firstNumber ," is the smallest") 
elif secondNumber < thirdNumber and secondNumber < firstNumber:
  print(secondNumber ," is the smallest") 
elif thirdNumber < firstNumber and thirdNumber < secondNumber:
  print(thirdNumber ," is the smallest") 


print("The sum is:",sum)
print("The average is:",average)
print("The product is:",product)
