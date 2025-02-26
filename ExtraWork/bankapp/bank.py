from ExtraWork.bankapp.account import Account


class Bank:
    def __init__(self):
        self.list_of_accounts = {}
        self.account_number = 0

    def get_account_number(self):
        self.account_number += 1
        return self.account_number

    def find_account(self, account_number):
        return self.list_of_accounts.get(account_number)

    def create_account(self, first_name, last_name, pin, age):
        account_number = self.get_account_number()
        account = Account(account_number,0)
        account_details = {
            "first_name": first_name,
            "last_name": last_name,
            "pin": pin,
            "age": age,
            "Account": account
        }
        self.list_of_accounts[account_number] = account_details

        print(f"Your account number is: {account_number}")

    def get_list_of_accounts(self):
        return len(self.list_of_accounts)

    def deposit(self, account_number, amount):
        if account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")
        if amount <= 0:
            raise ValueError("Deposit amount must be positive.")

        self.list_of_accounts[account_number]["Account"].balance += amount

    def get_balance(self, account_number, pin):
        if account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")

        account_details = self.list_of_accounts[account_number]

        if account_details["pin"] != pin:
            raise ValueError("Incorrect PIN.")

        return account_details["Account"].balance

    def withdraw(self, account_number, amount, pin):
        if account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")
        if amount <= 0:
            raise ValueError("Withdrawal amount must be positive.")

        account_details = self.list_of_accounts[account_number]

        if account_details["pin"] != pin:
            raise ValueError("Incorrect PIN.")
        if account_details["Account"].balance < amount:
            raise ValueError("Insufficient funds.")

        account_details["Account"].balance -= amount

    def transfer(self, owner_account_number, receiver_account_number, amount, pin):
        if owner_account_number not in self.list_of_accounts:
            raise ValueError("Sender account not found.")
        if receiver_account_number not in self.list_of_accounts:
            raise ValueError("Receiver account not found.")
        if amount <= 0:
            raise ValueError("Transfer amount must be positive.")

        sender_account = self.list_of_accounts[owner_account_number]
        receiver_account = self.list_of_accounts[receiver_account_number]

        if sender_account["pin"] != pin:
            raise ValueError("Incorrect PIN.")
        if sender_account["Account"].balance < amount:
            raise ValueError("Insufficient funds.")

        sender_account["Account"].balance -= amount
        receiver_account["Account"].balance += amount

    def delete_account(self, account_number):
        if account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")

        del self.list_of_accounts[account_number]
