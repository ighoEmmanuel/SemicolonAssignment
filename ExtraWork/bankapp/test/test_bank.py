from unittest import TestCase

from ExtraWork.bankapp import bank
from ExtraWork.bankapp.bank import Bank


class TestBankMethods (TestCase):


    def setUp(self):
        self.bank = Bank()



    def test_bank_create_account_and_updates_dictionary_size(self):
        self.bank.create_account("Emmanuel","Igho","2345",15)
        self.assertEqual(1,self.bank.get_list_of_accounts())

        self.bank.create_account("lase","igho","4567",12)
        self.assertEqual(2,self.bank.get_list_of_accounts())

    def test_bank_can_deposit_money_and_return_balance(self):
        self.bank.create_account("Emmanuel","igho","2345",15)
        self.bank.deposit(1,2000)
        self.assertEqual(2000,self.bank.get_balance(1,"2345"))



    def test_bank_can_withdraw_money_and_return_balance(self):
        self.bank.create_account("Emmanuel","igho","2345",15)
        self.bank.deposit(1,2000)
        self.bank.withdraw(1,1000,"2345")
        self.assertEqual(1000,self.bank.get_balance(1,"2345"))


    def test_bank_can_transfer_money_and_return_balance(self):
        self.bank.create_account("Emmanuel","igho","2345",15)
        self.bank.deposit(1,2000)
        self.bank.create_account("lase","igho","4567",12)
        self.bank.transfer(1,2,500,"2345")
        self.assertEqual(500,self.bank.get_balance(2,"4567"))
        self.assertEqual(1500,self.bank.get_balance(1,"2345"))