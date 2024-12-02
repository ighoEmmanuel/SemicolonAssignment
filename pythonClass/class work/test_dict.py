from unittest import TestCase
import dict

class TestDictFunction(TestCase):
	def test_that_get_dict_function_exists(self):
		dict.get_dict(10)

	def test_that_get_dict_function_correct_value(self):
		actual = dict.get_dict(5)
		expected = {2: 4, 4: 16} 
		self.assertEqual(actual, expected)