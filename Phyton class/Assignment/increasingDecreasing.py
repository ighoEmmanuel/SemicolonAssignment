firstNumber = int(input("Enter your first number:"))
secondNumber = int(input("Enter your second number:"))
thirdNumber = int(input("Enter your third number:"))


if firstNumber > secondNumber and secondNumber > thirdNumber:
  print( "This is Decreasing order")

if firstNumber < secondNumber and secondNumber < thirdNumber:
 print("This is a increasing order  ")

if firstNumber < secondNumber and secondNumber > thirdNumber:
  print("This not arrange ")


if firstNumber == secondNumber and firstNumber == thirdNumber:
   print("All are equal")


if firstNumber > secondNumber and secondNumber < thirdNumber:
  print("This not arrange ")


if firstNumber > secondNumber and firstNumber > thirdNumber:
    print("This not arrange ")


if thirdNumber > secondNumber and thirdNumber > firstNumber:
   print("This not arrange ")