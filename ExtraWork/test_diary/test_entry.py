import unittest
from ExtraWork.diaryapp.entry import Entry

class TestEntry(unittest.TestCase):

    def test_my_id_number_return_error_message_if_negative(self):
        with self.assertRaises(ValueError):
            Entry(-1, "Emmanuel", "a guy")

    def test_my_entry_return_error_if_title_is_null(self):
        with self.assertRaises(ValueError):
            Entry(1, None, "a guy")

    def test_my_entry_get_title_function(self):
        entry_saver = Entry(1, "Emmanuel", "a guy")
        self.assertEqual(entry_saver.title, "Emmanuel")

    def test_my_entry_get_id_function(self):
        entry_saver = Entry(1, "Emmanuel", "a guy")
        self.assertEqual(entry_saver.id, 1)

