from ExtraWork.bankapp.account import Account


class Bank:
    def __init__(self):
        self.list_of_accounts = {}
        self.account_number = 0

    def get_account_number(self):
        self.account_number += 1
        return self.account_number

    def create_account(self, first_name, last_name, pin, age):
        acc_number = self.get_account_number()
        account = Account(acc_number,0)
        account_details = {
            "first_name": first_name,
            "last_name": last_name,
            "pin": pin,
            "age": age,
            "account": account
        }
        self.list_of_accounts[acc_number] = account_details

    def get_list_of_accounts(self):
        return len(self.list_of_accounts)

    def deposit(self, account_number, amount):
        if account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")
        if amount <= 0:
            raise ValueError("Deposit amount must be positive.")
        self.list_of_accounts[account_number]["account"]._balance += amount



    def get_balance(self, account_number, pin):
        if account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")

        account_details = self.list_of_accounts[account_number]

        if account_details["pin"] != pin:
            raise ValueError("Incorrect PIN.")

        return account_details["account"].balance

    def withdraw(self, account_number, amount,pin):
        if account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")
        if amount <= 0:
            raise ValueError("Withdraw amount must be positive.")
        account_details = self.list_of_accounts[account_number]

        if account_details["pin"] != pin:
            raise ValueError("Incorrect PIN.")

        account_details["account"]._balance -= amount

    def transfer(self, owner_account_number, receiver_account_number, amount, pin):
        if owner_account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")
        if receiver_account_number not in self.list_of_accounts:
            raise ValueError("Account not found.")
        if amount <= 0:
            raise ValueError("Transfer amount must be positive.")
        owner_account_details = self.list_of_accounts[owner_account_number]
        receiver_account_details = self.list_of_accounts[receiver_account_number]
        receiver_account = receiver_account_details["account"]
        owner_account_details["account"].transfer(amount, receiver_account)


