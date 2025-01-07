def validator_odd(input):
    total = 0
    for count in range(0, len(input), 2):
        number = int(input[count]) * 2
        if number >= 10:
            total += (number // 10) + (number % 10)
        else:
            total += number
    return total

def validator_even(input):
    total = 0
    for count in range(1, len(input), 2):
        number = int(input[count]) * 2
        if number >= 10:
            total += (number // 10) + (number % 10)
        else:
            total += number
    return total

def validator(input, card_type):
    length = len(input)
    total = validator_odd(input) + validator_even(input)
    if total % 10 != 0:
        print("********************************************")
        print(f"**Credit Card Type: {card_type}")
        print(f"**Credit card Number: {input}")
        print(f"**Credit card Digit Length: {length}")
        print("**Credit card Validity status: Valid")
        print("********************************************")
    else:
        print("********************************************")
        print(f"**Credit Card Type: {card_type}")
        print(f"**Credit card Number: {input}")
        print(f"**Credit card Digit Length: {length}")
        print("**Credit card Validity status: Invalid")
        print("********************************************")

def main():
    print("4 for Visa Cards\n5 for MasterCard\n37 for American Express Cards\n6 for Discover cards")
    card_type = input("Enter the card type number: ")
    if card_type == '4':
        card_details = input("Enter Card details to verify: ")
        validator(card_details, "Visa Cards")
    elif card_type == '5':
        card_details = input("Enter Card details to verify: ")
        validator(card_details, "MasterCard")
    elif card_type == '37':
        card_details = input("Enter Card details to verify: ")
        validator(card_details, "American Express")
    elif card_type == '6':
        card_details = input("Enter Card details to verify: ")
        validator(card_details, "Discover Card")
    else:
        print("Invalid input")


main()
