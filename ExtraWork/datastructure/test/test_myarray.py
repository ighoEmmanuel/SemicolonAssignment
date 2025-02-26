from unittest import TestCase
import myarray

class TestMyArray(TestCase):
    def setUp(self):
       self.myArray = myarray.MyArray(5)


    def test_my_array(self):
        self.assertEqual(0, self.myArray.get_size())

    def test_my_array_add_items_function(self):
        self.myArray.my_append(1)
        self.myArray.my_append(3)
        self.assertEqual(2, self.myArray.get_size())
        self.myArray.my_append(3)
        self.assertEqual(3, self.myArray.get_size())

    def test_my_array_return_data(self):
        self.myArray.my_append(2)
        self.myArray.my_append(4)
        self.assertEqual([2,4], self.myArray.get_data())

    def test_my_array_add_function_return_error_message(self):
        self.assertRaises(TypeError, self.myArray.my_append (1),self.myArray.my_append(2),self.myArray.my_append(2),self.myArray.my_append(2),self.myArray.my_append(2))

    def test_my_array_add_function_return_data(self):
        self.myArray.my_append(1)
        self.assertEqual([1], self.myArray.get_data())


    def test_my_array_can_remove_from_the_array_and_return_the_size(self):
        self.myArray.my_append(1)
        self.myArray.my_append(2)
        self.myArray.my_append(3)
        self.myArray.remove_element(4)
        self.assertEqual(2, self.myArray.get_size())