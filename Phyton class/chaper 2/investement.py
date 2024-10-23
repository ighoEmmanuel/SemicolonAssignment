amount = int(input("Enter amount invested:"))

p = amount 

a1 = p * ( 1 + 7/100) ** 10
a2 = p * (1 + 7/100) ** 20
a3 = p * (1 + 7/100) ** 30
print("The return in 10 years ", a1)
print("The return in 20 years ", a2)
print("The return in 30 years ", a3)