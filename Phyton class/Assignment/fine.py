days = int(input("Enter number of days:"))

if days == 5:
 print("Your fine is 50 paise")

if days > 5  and days <= 10:
 print("Your fine is one rupee")

if days > 10 and days < 30 :
 print("Your fine is 5 rupee")

if days >= 30:
 print("Your membership will be cancelled")