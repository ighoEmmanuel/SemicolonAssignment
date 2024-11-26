from unittest import TestCase
import largest

class TestLargestFunction(TestCase):
	def test_that_largest_function_exists(self):
		largest.get_largest([1, 2, 3, 4, 5,9,3])

	def test_that_largest_function_return_correct_value(self):
		actual = largest.get_largest([1, 2, 3, 4, 5,9,3])
		expected = 9
		self.assertEqual(actual, expected)

	def test_that_largest_function_return_value(self):
		actual = largest.get_largest([-1, -2, -3, -4, -5, -9, -3])
		expected = -1
		self.assertEqual(actual, expected)


	def test_that_largest_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError,  largest.get_largest , ("moses"))


	def test_that_largest_function_raise_exception_with_invalid_stuff(self):
		self.assertRaises(TypeError,  largest.get_largest , (None))


class TestReverseFunction(TestCase):
	def test_that_reverse_function_exists(self):
		largest.get_reverse([1, 2, 3, 4, 5, 6, 7, 8])

	def test_that_reverse_function_return_value(self):
		actual = largest.get_reverse([1, 2, 3, 4, 5, 6, 7, 8])
		expected = [8, 7, 6, 5, 4, 3, 2, 1]
		self.assertEqual(actual, expected)

	def test_that_reverse_function_return_correct_value(self):
		actual = largest.get_reverse([1, 2, 3, 4, 2, 5, 6, 7, 8])
		expected = [8, 7, 6, 5,2, 4, 3, 2, 1]
		self.assertEqual(actual, expected)

	def test_that_largest_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError,  largest.get_reverse , ("moses"))


	def test_that_largest_function_raise_exception_with_invalid_stuff(self):
		self.assertRaises(TypeError,  largest.get_reverse , (None))

class TestElementFunction(TestCase):
	def test_that_element_function_exists(self):
		largest.get_element([1, 2, 3, 4, 5], 7)


	def test_that_element_function_return_value(self):
		actual = largest.get_element([1, 2, 3, 4, 5], 7)
		expected = False
		self.assertEqual(actual, expected)


	def test_that_element_function_return_correct_value(self):
		actual = largest.get_element([1, 2, 3, 4, 5], 3)
		expected = True
		self.assertEqual(actual, expected)

	def test_that_largest_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError,  largest.get_element , ("moses",3))


	def test_that_largest_function_raise_exception_with_invalid_stuff(self):
		self.assertRaises(TypeError,  largest.get_element , (None, 3))

	def test_that_largest_function_raise_exception_with_invalid(self):
		self.assertRaises(TypeError,  largest.get_element , (None, None))

	def test_that_largest_function_raise_exception_with_invalid_entered(self):
		self.assertRaises(TypeError,  largest.get_element , ("moses","ejcd"))


class TestRunningTotal(TestCase):
	def test_that_running_total_exists(self):
		largest.running_total([1, 2, 3, 4,5])

	def test_that_running_total_return_value(self):
		actual = largest.running_total([1, 2, 3, 4,5])
		expected = [1, 3, 6, 10, 15]
		self.assertEqual(actual, expected)



	def test_that_running_total_return_correct_value(self):
		actual = largest.running_total([-1, -2, -3, -4, -5])
		expected = [-1, -3, -6, -10, -15]
		self.assertEqual(actual, expected)

	def test_that_largest_function_raise_exception_with_invalid(self):
		self.assertRaises(TypeError,  largest.running_total , (None))

	def test_that_largest_function_raise_exception_with_invalid_entered(self):
		self.assertRaises(TypeError,  largest.running_total , ("moses"))

class TestPalindromeFunction(TestCase):
	def test_that_palindrome_function_exists(self):
		largest.get_palindrome("Madam")


	def test_that_palindrome_function_return_value(self):
		actual = largest.get_palindrome("Madam")
		expected = True
		self.assertEqual(actual, expected)



	def test_that_palindrome_function_return_correct_value(self):
		actual = largest.get_palindrome("look")
		expected = False
		self.assertEqual(actual, expected)
	def test_that_largest_function_raise_exception_with_invalid_entered(self):
		self.assertRaises(TypeError,  largest.get_palindrome , None)

		
