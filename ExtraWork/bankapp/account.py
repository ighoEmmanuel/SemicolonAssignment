class Account:
    def __init__(self, account_number, balance):
        self._account_number = account_number
        self._balance = balance

    @property
    def account_number(self):
        return self._account_number

    @property
    def balance(self):
        return self._balance

    def transfer(self, amount, beneficiary):
        if amount <= 0:
            raise ValueError("Transfer amount must be greater than zero.")

        if amount > self._balance:
            raise ValueError("Insufficient balance.")

        self._balance -= amount
        beneficiary._balance += amount

