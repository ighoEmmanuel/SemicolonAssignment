integer = int(input("Enter a number: "))
convertion = " "

while integer > 0:
   remaining = integer % 2
   convertion = str(remaining) + convertion
   integer = integer // 2
    
print(convertion)