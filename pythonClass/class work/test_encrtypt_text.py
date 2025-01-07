import unittest
from tiger_nut import encrtypt_text

class MyTestCase(unittest.TestCase):

    def test_that_get_number_shift_function_exists(self):
        encrtypt_text.get_number_shift("Emmanuel")

    def test_that_get_number_shift_function_return_correct_value(self):
        actual = encrtypt_text.get_number_shift("AA")
        expected = "NN"
        self.assertEqual(actual, expected)

    def test_that_get_number_shift_function_return_corrects_value(self):
        actual = encrtypt_text.get_number_shift("ZZ")
        expected = "MM"
        self.assertEqual(actual, expected)


    def test_that_get_number_shift_function_return_value(self):
        actual = encrtypt_text.get_number_shift("Mem")
        expected = "Zrz"
        self.assertEqual(actual, expected)


