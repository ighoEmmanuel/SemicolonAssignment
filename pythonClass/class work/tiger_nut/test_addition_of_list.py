from unittest import TestCase
import addition_of_list


class TestThatAdditionOfList(TestCase):
	def test_that_addition_of_list_exists(self):
		addition_of_list.get_add([1,2,3,4])

	def test_that_addition_of_list_return_value(self):
		actual = addition_of_list.get_add([1,2,3,4])
		expected = 6
		self.assertEqual(actual, expected)


	def test_that_addition_of_list_return_correct_value(self):
		actual = addition_of_list.get_add([2,2,2,2])
		expected = 8
		self.assertEqual(actual, expected)



	def test_that_addition_of_list_return(self):
		actual = addition_of_list.get_add([-2,2,2,2])
		expected = 4
		self.assertEqual(actual, expected)



	def test_that_addition_of_list_return_negative(self):
		actual = addition_of_list.get_add([-2,-2,-2,-2])
		expected = -8
		self.assertEqual(actual, expected)

	def test_that_addition_of_list_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, addition_of_list.get_add, "moses")




class TestThatGetVowelExist(TestCase):
	def test_that_get_vowel_function_exist(self):
		addition_of_list.get_vowel("python is life")


	def test_that_get_vowel_function_return_value(self):
		actual = addition_of_list.get_vowel("python is life")
		expected = 4
		self.assertEqual(actual, expected)


	def test_that_get_vowel_function_return_correct_value(self):
		actual = addition_of_list.get_vowel("we dey together omo")
		expected = 7
		self.assertEqual(actual, expected)


	def test_that_get_vowel_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, addition_of_list.get_add, 5)

	def test_that_get_vowel_function_raise_exception_with_invalid(self):
		self.assertRaises(TypeError, addition_of_list.get_add, None)

class TestAnagram(TestCase):
	def test_that_get_anagram_exist(self):
		addition_of_list.get_anagram("live","evil")


	def test_that_get_anagram_correct_value(self):
		actual = addition_of_list.get_anagram("polo","loop")
		expected = True
		self.assertEqual(actual, expected)
		

	def test_that_get_anagram_correct_value_correct(self):
		actual = addition_of_list.get_anagram("pol","loop")
		expected = False
		self.assertEqual(actual, expected)


	def test_that_get_anagram_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, addition_of_list.get_anagram, 5,5)


class TestPrimeNumbers(TestCase):
	def test_that_prime_function_exist(self):
		addition_of_list.get_prime(7)



	def test_that_prime_function_return(self):
		actual = addition_of_list.get_prime(7)
		expected = True
		self.assertEqual(actual, expected)

	def test_that_prime_function_return(self):
		actual = addition_of_list.get_prime(2)
		expected = True
		self.assertEqual(actual, expected)

class TestGetSum(TestCase):
	def test_that_get_sum_function_exist(self):
		addition_of_list.get_sum([1,2,3,4])

	def test_that_get_sum_function_correct(self):
		actual = addition_of_list.get_sum([1,2,3])
		expected = 12
		self.assertEqual(actual, expected)



	def test_that_get_sum_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, addition_of_list.get_sum, "Moses")



class TestGetMergeFunction(TestCase):
	def test_that_get_merge_function_exist(self):
		addition_of_list.get_combination([1,2,3], [7, 9, 8])



	def test_that_get_merge_function_return_value(self):
		actual  = addition_of_list.get_combination([1,2,4,90], [-8,3, 5, 6])
		expected = [-8,1, 2, 3, 4, 5, 6,90]
		self.assertEqual(actual, expected)


class TestPalindrom(TestCase):
	def test_that_palindrom_exists(self):
		addition_of_list.get_palindrom("Madam")



	def test_that_palindrom_return_value(self):
		actual = addition_of_list.get_palindrom("Madam")
		expected = True
		self.assertEqual(actual, expected)

	def test_that_palindrom_return_correct_value(self):
		actual = addition_of_list.get_palindrom("Eyes")
		expected = False
		self.assertEqual(actual, expected)


	def test_that_get_sum_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, addition_of_list.get_palindrom, 5556)


	def test_that_get_sum_function_raise_exception_with_invalid(self):
		self.assertRaises(TypeError, addition_of_list.get_palindrom, None)


class TestAverageFunction(TestCase):
	def test_that_average_function_exist(self):
		addition_of_list.get_average([10, 20, 30, 40])



	def test_that_average_function_return_value(self):
		actual = addition_of_list.get_average([10, 20, 30, 40])
		expected = 25.0
		self.assertEqual(actual, expected)


	def test_that_average_function_return_correct_value(self):
		actual = addition_of_list.get_average([10, 20, 30, 40, 50])
		expected = 30.0
		self.assertEqual(actual, expected)


	def test_that_average_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, addition_of_list.get_average, "ef")

	def test_that_average_function_raise_exception_with_invalid(self):
		self.assertRaises(TypeError, addition_of_list.get_average, None)

class TestReverseFunction(TestCase):
	def test_that_reverse_function_exist(self):
		addition_of_list.get_reverse("hello")

	def test_that_reverse_function_return(self):
		actual = addition_of_list.get_reverse("hello")
		expected = "olleh"
		self.assertEqual(actual, expected)

	def test_that_reverse_function_return_correct(self):
		actual = addition_of_list.get_reverse("look")
		expected = "kool"
		self.assertEqual(actual, expected)

	def test_that_reverse_function_raise_exception_with_invalid_input(self):
		self.assertRaises(TypeError, addition_of_list.get_reverse, 55)

class TestCapitalFunction(TestCase):
	def test_that_capital_function_exists(self):
		addition_of_list.get_capital(["yam","apple"])


	def test_that_capital_function_return_value(self):
		actual = addition_of_list.get_capital(["yam","apple"]) 
		expected = ["Yam","Apple"]
		self.assertEqual(actual, expected)

	def test_that_capital_function_return_correct_value(self):
		actual = addition_of_list.get_capital(["yam","apple","beans"]) 
		expected = ["Yam","Apple","Beans"]
		self.assertEqual(actual, expected)


class TestDuplicatesFunction(TestCase):
	def test_that_duplicate_function_exists(self):
		addition_of_list.get_duplicates([2 , 3, 6, 6, 10])



	def test_that_duplicate_function_return(self):
		actual = addition_of_list.get_duplicates([2 , 3, 6, 6, 10])
		expected = True
		self.assertEqual(actual, expected)


	def test_that_duplicate_function_return_correct_value(self):
		actual = addition_of_list.get_duplicates([2 , 3, 6,  10])
		expected = False
		self.assertEqual(actual, expected)

class TestSpaceFunction(TestCase):
	def test_that_space_function_exists(self):
		addition_of_list.get_spaces_out("hello kenny")



	def test_that_space_function_return(self):
		actual = addition_of_list.get_spaces_out("hello kenny")
		expected = "hellokenny"
		self.assertEqual(actual, expected)

	def test_that_space_function_return_correct_value(self):
		actual = addition_of_list.get_spaces_out("hello cap")
		expected = "hellocap"
		self.assertEqual(actual, expected)



class TestDuplicateArray(TestCase):
	def test_that_duplicate_function_exist(self):
		addition_of_list.get_duplicate_array([1,2,3], [3, 4, 5])


	def test_that_duplicate_function_return_value(self):
		actual = addition_of_list.get_duplicate_array([1,2,3], [3, 4, 5])
		expected = 3
		self.assertEqual(actual, expected)	






