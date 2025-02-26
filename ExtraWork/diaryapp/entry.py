class Entry:
    def __init__(self, id, title, content,date):
        if title is None or title.strip() == "":
            raise ValueError("title cannot be null or empty")
        if content is None or content.strip() == "":
            raise ValueError("content cannot be null or empty")
        if id < 0:
            raise ValueError("id cannot be negative")

        self.__id = id
        self.__title = title
        self.__content = content
        self.__date = date

    @property
    def id(self):
        return self.__id

    @property
    def title(self):
        return self.__title

    @title.setter
    def title(self, title):
        if title is None or title.strip() == "":
            raise ValueError("title cannot be null or empty")
        self.__title = title

    @property
    def content(self):
        return self.__content

    @content.setter
    def content(self, content):
        if content is None or content.strip() == "":
            raise ValueError("content cannot be null or empty")
        self.__content = content


    @property
    def date(self):
        return self.__date

    @date.setter
    def date(self, date):
        if date is None or date.strip() == "":
            raise ValueError("date cannot be null or empty")
        self.__date = date

    def update(self, title, content,date):
        if title and title.strip():
            self.title = title
        if content and content.strip():
            self.content = content
