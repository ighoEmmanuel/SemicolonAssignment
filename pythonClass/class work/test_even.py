from unittest import TestCase
import even

class TestEvenFunction(TestCase):
	def test_that_even_function_exist(self):
		even.get_even([1, 2, 3, 4, 5,])


	def test_that_even_function_correct_value(self):
		actual = even.get_even([1, 2, 3, 4, 5,])
		expected = 6
		self.assertEqual(actual, expected)

	def test_that_even_function_return_correct_value(self):
		actual = even.get_even([1, 2, 3, 4, 5,6])
		expected = 12
		self.assertEqual(actual, expected)


	def test_that_even_function_return_value(self):
		actual = even.get_even([1, 2, 3, 4, 5,6,-8,-9,-10])
		expected = -6
		self.assertEqual(actual, expected)




	def test_that_even_function_raise_exception_with_invalid_entered(self):
		self.assertRaises(TypeError,  even.get_even , ("moses"))




	def test_that_even_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError,  even.get_even , (None))


class TestThatNumberOfEven(TestCase):
	def test_that_number_of_even_exists(self):
		even.number_of_even([1, 5, 7, 3, 22, 9, 8, 10])


	def test_that_number_of_even_correct_value(self):
		actual = even.number_of_even([1, 5, 7, 3, 22, 8, 10])
		expected = 3
		self.assertEqual(actual, expected)


	def test_that_number_of_even_correct_input(self):
		actual = even.number_of_even([1, 5, 7, 3, 22, 8, 10,11,13])
		expected = 3
		self.assertEqual(actual, expected)


class TestThatNumberEvenFunction(TestCase):
	def test_that_number_even_function_exists(self):
		even.number_even([1, 2, 3, 4, 5, 6, 7, 8])



	def test_that_number_even_function_return(self):
		actual = even.number_even([1, 2, 3, 4, 5, 6, 7, 8])
		expected = [False, True, False, True, False, True,False, True]
		self.assertEqual(actual, expected)
