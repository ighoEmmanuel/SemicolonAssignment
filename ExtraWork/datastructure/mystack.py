class MyStack:
    def __init__(self):
        self.stack = []

    def is_empty(self):
        return len(self.stack) == 0


    def push(self, item):
        self.stack.append(item)

    def size(self):
        return len(self.stack)

    def pop(self):
        if len(self.stack) == 0:
            raise ValueError("pop from empty stack")
        top_item = self.stack[-1]
        self.stack = self.stack[:-1]
        return top_item

    def peek(self):
        if len(self.stack) == 0:
            raise IndexError("peek from empty stack")
        return self.stack[-1]


