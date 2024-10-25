begin = int(input("Enter the start of the range (): "))
end = int(input("Enter the end of the range (): "))
divider= int(input("Enter the divisor (): "))


if begin <= end and divider != 0:
   
    count = 0


    for i in range(begin, end + 1):
        # Check if number is divisible by divider
        if i % divider == 0:
            count += 1

  
    print(f"Count of numbers between {begin} and {end} divisible by {divider}: {count}")
else:
    print("Invalid input. Please ensure start is less than or equal to end and divisor is non-zero.")