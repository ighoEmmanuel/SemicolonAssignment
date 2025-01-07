from datetime import datetime


class Entry:
    def __init__(self, id, title, content):
        if title is None or title.strip() == "":
            raise ValueError("title cannot be null or empty")
        if content is None or content.strip() == "":
            raise ValueError("content cannot be null or empty")
        if id < 0:
            raise ValueError("id cannot be negative")

        self._id = id
        self._title = title
        self._content = content
        self.date = datetime.now()

    @property
    def id(self):
        return self._id

    @property
    def title(self):
        return self._title

    @title.setter
    def title(self, title):
        if title is None or title.strip() == "":
            raise ValueError("title cannot be null or empty")
        self._title = title

    @property
    def content(self):
        return self._content

    @content.setter
    def content(self, content):
        if content is None or content.strip() == "":
            raise ValueError("content cannot be null or empty")
        self._content = content

    def get_date(self):
        return self.date.strftime("%d/%m/%Y")

    def update(self, title, content):
        if title and title.strip():
            self.title = title
        if content and content.strip():
            self.content = content
