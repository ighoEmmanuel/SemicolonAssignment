import unittest
from ExtraWork.diaryapp.diary import Diary

class TestDiary(unittest.TestCase):

    def test_if_my_diary_is_locked(self):
        diary = Diary("Emmanuel", "jojo")
        self.assertTrue(diary.is_locked)

    def test_if_my_diary_is_unlocked(self):
        diary = Diary("Emmanuel", "jojo")
        diary.unlock("jojo")
        self.assertFalse(diary.is_locked)

    def test_if_my_diary_is_unlocked_and_then_locked(self):
        diary = Diary("Emmanuel", "jojo")
        diary.unlock("jojo")
        diary.create_entry("title", "My guy")
        diary.lock()
        self.assertTrue(diary.is_locked)

    def test_my_diary_find_function_is_working(self):
        diary = Diary("Emmanuel", "jojo")
        diary.unlock("jojo")
        diary.create_entry("title", "My guy")
        input_entry = diary.find_entry(1)
        self.assertEqual(input_entry.title, "title")

    def test_my_delete_function_is_working(self):
        diary = Diary("Emmanuel", "jojo")
        diary.unlock("jojo")
        diary.create_entry("title", "My guy")
        diary.create_entry("oat", "my man")
        diary.delete(1)
        with self.assertRaises(ValueError):
            diary.find_entry(1)

    def test_my_diary_can_update_entry(self):
        diary = Diary("Emmanuel", "jojo")
        diary.unlock("jojo")
        diary.create_entry("title", "My guy")
        diary.create_entry("oat", "my man")
        diary.update(1, "emma", "okay")
        self.assertEqual(diary.find_entry(1).title, "emma")

