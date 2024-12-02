from unittest import TestCase
import square

class  TestSquare(TestCase):
	def test_that_square_function_exist(self):
		square.get_square(4)

	def test_that_square_function_correct_value(self):
		actual = square.get_square(6)
		expected = [1, 4, 9, 16, 25, 36]



	def test_that_square_function_negative_correct_value(self):
		actual = square.get_square(-6)
		expected = [1, 4, 9, 16, 25, 36]

	def 
class TestLargestFunction(TestCase):
	def test_that_largest_function_exists(self):
		square.get_largest([1, 5, 12, 15, 8])



	def test_that_largest_function_return_value(self):
		actual = square.get_largest([1, 5, 12, 15, 8])
		expected = [12, 15]
		self.assertEqual(actual, expected)

	def test_that_largest_function_return_correct_value(self):
		actual = square.get_largest([1, 5, -12, 15, 8])
		expected = [15]
		self.assertEqual(actual, expected)