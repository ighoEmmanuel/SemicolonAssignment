
import math
polygon = int(input('Enter number of sides on the polygon:'))
length = float(input('Enter the length of one of the sides:'))
n = polygon
s = length 
area = (n * (s**2)) / (4 * math.tan(3.14 / n))
print('The area is: ', area)