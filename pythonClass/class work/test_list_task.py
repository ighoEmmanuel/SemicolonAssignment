from unittest import TestCase
import list_task


class TestSumFunction(TestCase):
	def test_that_get_sum_function_exists(self):
		list_task.get_sum([1, 2, 3])




	def test_that_get_sum_function_correct_value(self):
		actual = list_task.get_sum([1, 2, 3])
		expected = [2, 4, 6]
		self.assertEqual(actual, expected)


	def test_that_get_sum_function_correct_negative_value(self):
		actual = list_task.get_sum([-1, 2, 3])
		expected = [-2, 4, 6]
		self.assertEqual(actual, expected)


class TestLongestFunction(TestCase):
	def test_that_get_longest_exists(self):
		list_task.get_longest(["Apple", "orange","fish","ice", "lime"])
	


	def test_that_get_longest_return_correct_value(self):
		actual = list_task.get_longest(["Apple", "orange","fish","ice", "lime"])
		expected = ["Apple", "orange"]
		self.assertEqual(actual, expected)
