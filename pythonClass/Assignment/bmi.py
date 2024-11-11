weight  = int(input("Enter weight in pounds:"))
height = int(input("Enter height in inches:"))

kilogram = weight * 703
bmi = kilogram / (height * height)

print('The BMI is ',bmi)