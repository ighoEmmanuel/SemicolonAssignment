from unittest import TestCase

from ExtraWork.datastructure.myqueue import MyQueue
class TestMyQueue(TestCase):

    def setUp(self):
        self.my_queue = MyQueue()


    def test_that_my_queue_is_empty_when_created(self):
        self.assertTrue(self.my_queue.is_empty())

    def test_that_my_queue_can_add_items_and_get_size(self):
        self.my_queue.push(20)
        self.my_queue.push(30)
        self.assertEqual(2,self.my_queue.size())

    def test_that_my_queue_throws_error_when_queue_is_empty_and_wants_to_check_the_first_element(self):
        with self.assertRaises(ValueError):
            self.my_queue.peek()


    def test_that_my_queue_can_remove_items_to_the_queue(self):
        self.my_queue.push(20)
        self.my_queue.push(30)
        self.my_queue.push(40)
        self.my_queue.pop()
        self.assertEqual(2,self.my_queue.size())

    def test_that_my_queue_can_check_the_last_element_with_out_removing_it(self):
        self.my_queue.push(20)
        self.my_queue.push(30)
        self.my_queue.push(40)
        self.assertEqual(20,self.my_queue.peek())
