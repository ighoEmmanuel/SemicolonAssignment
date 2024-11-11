
print("(a)\t\t(b)\t\t(c)\t\t(d)")


for count in range (1,11):
   col_a = "*" * count



for number in range(11,0,-1):
   col_b=" " * (11 - number) + "*" * number


for reader in range(11,0,-1):
   col_c ="*" * reader
   

for counter in range(-1,11):
  d = " " * (11 - number) + "*" * counter

print(f"{col_a:<12}\t{col_b:<12}\t{col_c:<12}\t{d:<12}")