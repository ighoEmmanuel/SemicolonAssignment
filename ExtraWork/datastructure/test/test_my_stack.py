from unittest import TestCase

from ExtraWork.datastructure.mystack import MyStack

class TestMyStack(TestCase):


    def setUp(self):
        self.my_stack = MyStack()


    def test_that_my_stack_is_empty(self):
        self.assertTrue(self.my_stack.is_empty())


    def test_that_my_stack_can_add_elements(self):
        self.my_stack.push(3)
        self.my_stack.push(4)
        self.my_stack.push(5)
        self.assertEqual(3, self.my_stack.size())


    def test_that_my_stack_can_remove_elements(self):
        self.my_stack.push(3)
        self.my_stack.push(4)
        self.my_stack.push(5)
        self.my_stack.pop()
        self.assertEqual(2, self.my_stack.size())


    def test_that_my_stack_can_check_the_last_element_with_out_removing_it(self):
        self.my_stack.push(3)
        self.my_stack.push(4)
        self.my_stack.push(5)
        self.assertEqual(5, self.my_stack.peek())


