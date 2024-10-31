import math 
a = float(input("Enter a number:"))
b = float(input("Enter b number:"))
c = float(input("Enter c number:"))
root1 = (-b + (math.sqrt((b * b) - (4 * a * c)))) / 2 * a
root2 = (-b - (math.sqrt((b * b) - (4 * a * c)))) / 2 * a
print("The roots are " , root1 ," and ", root2)