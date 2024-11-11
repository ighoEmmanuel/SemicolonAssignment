zero = 0
positive = 0
negative = 0
for counter in range(1,6):
    number = int(input(f" Enter number {counter}:"))
    if number < 0:
        negative += 1

    if number > 0:
        positive +=1

 
    if number == 0:
        zero  += 1
print("The number of positive is ", positive)
print("The number of negative is ", negative)
print("The number of zeros is  ", zero)
