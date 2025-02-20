import unittest
from unittest import TestCase
from ExtraWork.set import MySet

class TestMySet(TestCase):
    def setUp(self):
        self.my_set = MySet()

    def test_my_set_isEmpty(self):
        self.assertTrue(self.my_set.is_empty())


    def test_my_set_add_and_get_size(self):
        self.my_set.add("apple")
        self.my_set.add("banana")
        self.my_set.add("apple")
        self.assertEqual(self.my_set.get_size(),2)

    def test_my_set_can_add_all_at_once(self):
        self.my_set.add_all(["cherry", "date", "banana"])
        self.assertEqual(self.my_set.get_size(), 3)

    def test_my_set_can_remove(self):
        self.my_set.add_all(["cherry", "date", "banana"])
        self.assertEqual(self.my_set.get_size(), 3)
        self.my_set.removal("banana")
        self.assertEqual(self.my_set.get_size(), 2)

    def test_my_set_contains_an_element(self):
        self.my_set.add_all(["cherry", "date", "banana"])
        self.assertEqual(self.my_set.get_size(), 3)
        self.assertTrue(self.my_set.contains("banana"))

    def test_my_set_can_remove_all_elements_at_once(self):
        self.my_set.add_all(["cherry","date","banana"])
        self.my_set.add("apple")
        self.my_set.remove_all(["cherry","date","banana","apple"])
        self.assertEqual(self.my_set.get_size(), 0)


    def test_that_when_i_add_elements_to_my_set_and_i_will_get_the_data_in_the_set(self):
        self.my_set.add_all(["cherry","date","banana"])
        self.my_set.add("apple")
        self.assertEqual(self.my_set.get_elements(), ["cherry","date","banana","apple"])


