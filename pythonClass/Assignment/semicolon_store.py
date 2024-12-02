def name_of_user():
    return input("What is the customer's Name? ")


def customer_details():
    return input("What did the customer buy? ")


def number_of_pieces():
    while True:
        try:
            return int(input("How many pieces? "))
        except ValueError:
            print("Please enter a valid number.")


def per_unit():
    while True:
        try:
            return float(input("How much per unit? "))
        except ValueError:
            print("Please enter a valid price.")


def calculate_total(pieces, unit_price):
    return pieces * unit_price


def options():
    items = []
    while True:
        customer_item = customer_details()
        pieces = number_of_pieces()
        unit_price = per_unit()
        total_price = calculate_total(pieces, unit_price)

        items.append((customer_item, pieces, unit_price, total_price))

        option = input("Add more items? (yes/no): ").strip().lower()
        if option != "yes":
            break
    return items


def print_items():
    customer_name = name_of_user()
    print(f"\nCustomer Name: {customer_name}")

    items = options()

    print("\n\t\tITEM\t\tQTY\t\tPRICE\t\t\tTOTAL(NGN)")
    print("----------------------------------------------------------------")
    for item, qty, price, total in items:
        print(f"\t\t{item:<20}\t{qty:<10}\t{price:<10.2f}\t{total:<10.2f}")
    print("----------------------------------------------------------------")


    print_items()
