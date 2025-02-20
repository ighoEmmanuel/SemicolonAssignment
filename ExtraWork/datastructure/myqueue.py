class MyQueue:
    def __init__(self):
        self.data = []

    def is_empty(self):
        return len(self.data) == 0

    def push(self, element):
        self.data.append(element)

    def size(self):
        return len(self.data)

    def pop(self):
        if len(self.data) == 0:
            raise ValueError("queue from empty stack")
        top_item = self.data[0]
        self.data = self.data[1:]
        return top_item

    def peek(self):
        if len(self.data) == 0:
            raise ValueError("queue from empty stack")
        return self.data[0]