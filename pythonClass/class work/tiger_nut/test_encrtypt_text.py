import unittest
import encrtypt_text

class MyTestCase(unittest.TestCase):

    def test_that_get_number_shift_function_exists(self):
        encrtypt_text.get_number_shift("Emmanuel")

    def test_that_get_number_shift_function_return_correct_value(self):
        actual = encrtypt_text.get_number_shift("AA")
        expected = "MM"
        self.assertEqual(actual, expected)


