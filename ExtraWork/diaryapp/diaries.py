from ExtraWork.diaryapp.diary import Diary

class Diaries:
    def __init__(self):
        self.data = []

    def add_diary(self, username, password):
        new_diary = Diary(username, password)
        self.data.append(new_diary)

    def delete(self, username, password):
        diary = self.find_username(username)
        if diary is not None and diary.validate_password(password):
            self.data.remove(diary)
        else:
            raise ValueError("Invalid username or password")

    def find_username(self, username):
        for diary in self.data:
            if diary.username == username:
                return diary
        return None

