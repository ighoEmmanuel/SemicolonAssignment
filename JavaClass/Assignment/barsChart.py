for a in range(5):
    while True:
        number = int(input("Enter a number between 1 and 30: "))
        if 1 <= number <= 30:
            break
        print("Invalid input. Please try again.")
        
    print(f"Number: {number}")
    print("*" * number)
    print()