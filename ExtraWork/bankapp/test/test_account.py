from unittest import TestCase
from ExtraWork.bankapp import account

class TestAccount(TestCase):
    def setUp(self):
        self.account_one = account.Account(25,5000)
        self.account_two = account.Account(5,10000)

    def test_that_transfer_negative_from_account_one_to_account_two(self):
        with self.assertRaises(ValueError):
            self.account_one.transfer(-100,self.account_two)

    def test_that_transfer_can_transfer_from_account_one_to_account_two_and_get_balance(self):
        self.account_one.transfer(1000, self.account_two)
        first_balance = self.account_one.balance
        second_balance = self.account_two.balance
        self.assertEqual(4000, first_balance)
        self.assertEqual(11000, second_balance)




