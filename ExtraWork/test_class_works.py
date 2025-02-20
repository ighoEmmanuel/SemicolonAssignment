from unittest import TestCase
import class_works
class TestMyFunctionInMyClassWork(TestCase):
    def test_that_last_list_adder_exist(self):
        actual = class_works.last_list_adder([5,5,5])
        expected = [5,5,6]
        self.assertEqual(actual, expected)

    def test_that_last_list_adder_throw_error_inValid_input(self):
        self.assertRaises(TypeError, class_works.last_list_adder,2)

    def test_that_last_list_adder_return_correct_value(self):
        actual = class_works.last_list_adder([9,99,9])
        expected = [1,0,0,0,0]
        self.assertEqual(actual, expected)