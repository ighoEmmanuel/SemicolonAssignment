start = int(input("Enter the start of the range (): "))
end = int(input("Enter the end of the range (): "))
divisor = int(input("Enter the divisor (): "))


if start <= end and divisor != 0:
   
    count = 0


    for i in range(start, end + 1):
        # Check if number is divisible by divisor
        if i % divisor == 0:
            count += 1

  
    print(f"Count of numbers between {start} and {end} divisible by {divisor}: {count}")
else:
    print("Invalid input. Please ensure start is less than or equal to end and divisor is non-zero.")