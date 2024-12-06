from datetime import datetime

def print_receipt():
    print("SEMICOLON STORES")
    print("MAIN BRANCH")
    print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
    print("TEL: 83293828343")
    
    customer_name = input("Enter the customer's name: ")
    receipt = ""
    grand_total = 0.0

    while True:
        item_name = input("What did the customer buy? ")
        quantity = int(input("How many pieces? "))
        unit_price = float(input("How much per unit? "))
        total_price = quantity * unit_price
        grand_total += total_price

        receipt += f"{item_name}\t\t{quantity}\t\t{unit_price:.2f}\t\t{total_price:.2f}\n"

        add_more = input("Add more items? (yes/no): ").strip().lower()
        if add_more != "yes":
            break

    cashier_name = input("What is your name? ")
    discount = float(input("How much discount will the customer get? "))
    vat_rate = 0.175
    vat_total = grand_total * vat_rate
    bill_total = (grand_total - discount) + vat_total

    date = datetime.now().strftime("%Y-%m-%d %H:%M:%S")

    print("\n" + "=" * 60)
    print("SEMICOLON STORES")
    print("MAIN BRANCH")
    print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
    print("TEL: 83293828343")
    print(f"Date: {date}")
    print(f"Cashier: {cashier_name}")
    print(f"Customer Name: {customer_name}")
    print("\nITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)")
    print("=" * 60)
    print(receipt, end="")
    print("-" * 60)
    print(f"\t\tGrand Total: \t\t\t{grand_total:.2f}")
    print(f"\t\tDiscount: \t\t\t{discount:.2f}")
    print(f"\t\tVAT @ 17.50%: \t\t\t{vat_total:.2f}")
    print("=" * 60)
    print(f"\t\tBill Total: \t\t\t{bill_total:.2f}")
    print("=" * 60)
    print(f"THIS IS NOT A RECEIPT. KINDLY PAY: {bill_total:.2f}")
    print("=" * 60)

    amount_paid = float(input("How much did the customer give to you? "))
    balance = amount_paid - bill_total

    print("\n" + "=" * 60)
    print("SEMICOLON STORES")
    print("MAIN BRANCH")
    print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
    print("TEL: 83293828343")
    print(f"Date: {date}")
    print(f"Cashier: {cashier_name}")
    print(f"Customer Name: {customer_name}")
    print("\nITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)")
    print("=" * 60)
    print(receipt, end="")
    print("-" * 60)
    print(f"\t\tGrand Total: \t\t\t{grand_total:.2f}")
    print(f"\t\tDiscount: \t\t\t{discount:.2f}")
    print(f"\t\tVAT @ 17.50%: \t\t\t{vat_total:.2f}")
    print("=" * 60)
    print(f"\t\tBill Total: \t\t\t{bill_total:.2f}")
    print(f"\t\tAmount Paid: \t\t\t{amount_paid:.2f}")
    print(f"\t\tBalance: \t\t\t{balance:.2f}")
    print("=" * 60)
    print("THANK YOU FOR YOUR PATRONAGE")
    print("=" * 60)

print_receipt()
