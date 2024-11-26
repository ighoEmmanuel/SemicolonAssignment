from unittest import TestCase
import even_odd

class TestEvenOddFunction(TestCase):
	def test_that_even_odd_function_exist(self):
		even_odd.get_even([1, 2, 3, 4, 5])


	def test_that_even_odd_function_return_value(self):
		actual = even_odd.get_even([1, 2, 3, 4, 5])
		expected = [False, True, False, True, False]
		self.assertEqual(actual, expected)




	def test_that_even_odd_function_return_correct_value(self):
		actual = even_odd.get_even([-1, -2, -3, -4, -5])
		expected = [False, True, False, True, False]
		self.assertEqual(actual, expected)



	def test_that_even_odd_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, even_odd.get_even, ["moses"])



class TestRearrangeFunction(TestCase):
	def test_that_rearrange_function_exists(self):
		even_odd.divide_list([1, 2, 3, 4, 5])



	def test_that_rearrange_function_return_value(self):
		actual = even_odd.divide_list([1, 2, 3, 4, 5])
		expected = [1,2], [3, 4,5]
		self.assertEqual(actual, expected)


	def test_that_rearrange_function_return_corret_value(self):
		actual = even_odd.divide_list([1, 2, 3, 4, 5, 6])
		expected = [1, 2, 3], [4, 5, 6]
		self.assertEqual(actual, expected)



	def test_that_rearrange_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, even_odd.divide_list, ["moses"])
