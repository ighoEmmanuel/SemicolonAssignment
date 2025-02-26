from ExtraWork.bankapp.bank import Bank

bank = Bank()


def main_menu():
    while True:
        print("""
        Welcome to StoneCode Banking Application

        1. Create a new account
        2. Deposit
        3. Withdraw
        4. Check Balance
        5. Transfer Funds
        6. Delete Account
        7. Exit
        """)

        choice = input("Select an option (1-7): ")

        if choice == "1":
            create_account()
        elif choice == "2":
            deposit()
        elif choice == "3":
            withdraw()
        elif choice == "4":
            check_balance()
        elif choice == "5":
            transfer_funds()
        elif choice == "6":
            delete_account()
        elif choice == "7":
            print("Thank you for using my application.")
            break
        else:
            print("Invalid choice. Please select a valid option.")


def create_account():
    first_name = input("Enter your first name: ")
    last_name = input("Enter your last name: ")
    age = int(input("Enter your age: "))
    if age < 18:
        print("You must be at least 18 years old to create an account.")
        return
    pin = input("Enter a 4-digit PIN: ")
    while not (pin.isdigit() and len(pin) == 4):
        print("Invalid PIN. Please enter a 4-digit number.")
        pin = input("Enter a 4-digit PIN: ")
    bank.create_account(first_name, last_name, pin, age)
    print("Account created successfully.")


def deposit():
    acc_number = int(input("Enter your account number: "))
    if bank.find_account(acc_number) is None:
        print("Account does not exist.")
        return
    amount = float(input("Enter deposit amount: "))
    if amount < 0:
        print("You cannot deposit negative amount.")
        return
    try:
        bank.deposit(acc_number, amount)
        print("Deposit successful.")
    except ValueError as e:
        print(f"Error: {e}")


def withdraw():
    acc_number = int(input("Enter your account number: "))
    if bank.find_account(acc_number) is None:
        print("Account does not exist.")
        return
    amount = float(input("Enter deposit amount: "))
    if amount < 0:
        print("You cannot deposit negative amount.")
        return
    pin = input("Enter your PIN: ")
    try:
        bank.withdraw(acc_number, amount, pin)
        print("Withdrawal successful.")
    except ValueError as e:
        print(f"Error: {e}")


def check_balance():
    acc_number = int(input("Enter your account number: "))
    if bank.find_account(acc_number) is None:
        print("Account does not exist.")
        return
    pin = input("Enter your PIN: ")
    try:
        balance = bank.get_balance(acc_number, pin)
        print(f"Your balance is: {balance}")
    except ValueError as e:
        print(f"Error: {e}")


def transfer_funds():
    sender_acc = int(input("Enter your account number: "))

    if not bank.find_account(sender_acc):
        print("Account does not exist.")
        return

    receiver_acc = int(input("Enter recipient's account number: "))

    if not bank.find_account(receiver_acc):
        print("Recipient account does not exist.")
        return

    amount = float(input("Enter transfer amount: "))
    pin = input("Enter your PIN: ")

    try:
        bank.transfer(sender_acc, receiver_acc, amount, pin)
        print("Transfer successful.")
    except ValueError as e:
        print(f"Error: {e}")


def delete_account():
    acc_number = int(input("Enter your account number: "))
    confirm = input("Are you sure you want to delete your account? (yes/no): ")
    if confirm.lower() == "yes":
        try:
            bank.delete_account(acc_number)
            print("Account deleted successfully.")
        except KeyError:
            print("Account not found.")
    else:
        print("Account deletion canceled.")



if __name__ == "__main__":
    try:
        main_menu()
    except KeyboardInterrupt:
        print("\nProgram exited by user.")
    except Exception as e:
        print(f"Critical error: {e}")