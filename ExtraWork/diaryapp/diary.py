from ExtraWork.diaryapp.entry import Entry
from datetime import datetime

class Diary:
    def __init__(self, username, password):
        self._username = username
        self.password = password
        self._is_locked = True
        self.entries = []

    @property
    def username(self):
        return self._username



    @property
    def is_locked(self):
        return self._is_locked

    def get_id(self):
        return len(self.entries) + 1

    def unlock(self, password):
        if self.validate_password(password):
            self._is_locked = False
        else:
            raise ValueError("Password does not match")

    def lock(self):
        self._is_locked = True

    def create_entry(self, title, body):
        if not self.is_locked:
            entry_id = self.get_id()
            date = datetime.today().date()
            new_entry = Entry(entry_id, title, body,date)
            self.entries.append(new_entry)
            print(f"New entry created\nYour Entry ID: {entry_id}")
        else:
            raise ValueError("Diary is locked, unlock first")

    def find_entry(self, id_number):
        if self.is_locked:
            raise ValueError("Unlock diary first!!")

        for entry in self.entries:
            if entry.id == id_number:
                return entry

        raise ValueError("ID not found")

    def delete_entry(self, id_number):
        if self.is_locked:
            print("Unlock diary first!!")
            return
        to_remove = None
        for entry in self.entries:
            if entry.id == id_number:
                to_remove = entry
                break
        if to_remove:
            self.entries.remove(to_remove)

    def update(self, id_number, title, body):
        if self.is_locked:
            raise ValueError("Unlock diary first!!")
        for entry in self.entries:
            if entry.id == id_number:
                date = datetime.today().date()
                entry = self.find_entry(id)
                entry.title(title)
                entry.content(body)
                entry.date(date)
            else:
                raise ValueError("ID not found")

    def validate_password(self, password):
        return password == self.password



    def view_entries(self):
        output = []
        for entry in self.entries:
            output.append(f"Entry ID: {entry.id}\n"
                          f"Title: {entry.title}\n"
                          f"Content: {entry.content}\n"
                          f"Date: {entry.date}\n"
                          f"-------------------")
        return "\n".join(output)