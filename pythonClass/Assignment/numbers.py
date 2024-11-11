numberA = int(input("enter 3 number:"))
FirstE = numberA //100
SecondC = numberA % 10
toSec = numberA//100
ThirdD = toSec % 10
print(SecondC,ThirdD,FirstE)
evenN = 0
oddN = 0
if FirstE % 2==0:
   evenN = evenN + 1
else:
   oddN = oddN + 1
if SecondC % 2 == 0:
   evenN = evenN + 1
if ThirdD % 2 == 0:
   evenN = evenN + 1
else:
   oddN = oddN + 1
print("even is: ",evenN )
print("and odd is: ", oddN)
