class MyArray:
    def __init__(self, capacity):
        self.capacity = capacity
        self.data = []
        self.size = 0

    def get_size(self):
        return self.size

    def my_append(self, value):
        if type(value) == list:
            value = self.data + [value]
        self.data = self.data + [value]
        self.size += 1

    def get_data(self):
        return self.data


    def remove_element(self, index):
        self.data = self.data[:index]
        self.size = self.size - 1



