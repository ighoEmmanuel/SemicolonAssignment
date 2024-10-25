pound = float(input('Enter weight in pounds:'))
inches = float(input('Enter height in inches:'))
kilogram = 0.45359237 * pound
meters = 0.0254 * inches
bmi = kilogram / (meters * meters)
print('BMI is ' , bmi)