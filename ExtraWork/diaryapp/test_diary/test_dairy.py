import unittest

from ExtraWork.diaryapp.diary import Diary

class TestDiary(unittest.TestCase):

    def setUp(self):
       self.diary = Diary("Emmanuel", "jojo")


    def test_if_my_diary_is_locked_when_created_at_first(self):
        self.assertTrue(self.diary.is_locked)

    def test_that_my_diary_unlocks_when_it_is_unlocked(self):
        self.diary.unlock("jojo")
        self.assertFalse(self.diary.is_locked)

    def test_that_my_diary_unlocks_and_then_locked(self):
        self.diary.unlock("jojo")
        self.diary.create_entry("title", "My guy")
        self.diary.lock()
        self.assertTrue(self.diary.is_locked)

    def test_my_diary_find_function_is_working(self):
        self.diary.unlock("jojo")
        self.diary.create_entry("title", "My guy")
        input_entry = self.diary.find_entry(1)
        self.assertEqual(input_entry.title, "title")

    def test_my_delete_entry_function_is_working(self):
        self.diary.unlock("jojo")
        self.diary.create_entry("title", "My guy")
        self.diary.create_entry("oat", "my man")
        self.diary.delete_entry(1)
        with self.assertRaises(ValueError):
            self.diary.find_entry(1)

    def test_my_diary_can_update_entry(self):
        self.diary.unlock("jojo")  # Unlock before modifying
        self.diary.create_entry("title", "My guy")
        self.diary.create_entry("oat", "my man")
        found_entry = self.diary.find_entry(1)
        self.assertEqual(found_entry.title, "title")