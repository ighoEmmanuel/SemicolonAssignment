numberP = int(input("enter 3-digit number:"))
firstA = numberP //100
Second = numberP % 10
toSec = numberP//10
Third = toSec % 10
print(Second,Third,firstA)
evenn = 0
oddn = 0
if firstA % 2 == 0:
  evenn = evenn +1
else:
  oddn = oddn +1
if Second % 2 == 0:
   evenn = evenn +1
else:
   oddn = oddn +1
if Third % 2 == 0:
   evenn = evenn +1
else:
   oddn = oddn +1
print("even is: ",evenn)
print("and odd is: ", oddn)

if firstA == Second :
   print( numberP, "is a Palindrome")
else:
    print(numberP, "is not a Pallindrome" )