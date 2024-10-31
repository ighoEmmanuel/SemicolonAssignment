import random

number = int(input("Guess a number between 1 and 100:"))
guess = 9;
while (number != guess ):
 if number == guess:
  print ("Congratulation\nYou are correct")
 if number >= guess:
       print("Too high\ntry again!!")
 if number < guess:
         print("Too low\ntry again!!")
count++
