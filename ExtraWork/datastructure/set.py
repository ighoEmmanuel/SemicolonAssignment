class MySet:
    def __init__(self):
        self.size = 0
        self.elements = []

    def is_empty(self):
        return self.size == 0

    def is_not_empty(self):
        return self.size > 0

    def add(self, element):
        if element not in self.elements:
            self.elements = self.elements + [element]
            self.size += 1

    def get_size(self):
        return self.size

    def contains(self, element):
        return element in self.elements

    def remove_all(self, items_to_remove):
        for item in items_to_remove:
            if item in self.elements:
                self.removal(item)


    def add_all(self, items_to_add):
        for item in items_to_add:
            if item not in self.elements:
                self.elements = self.elements + [item]
                self.size += 1

    def removal(self, element):
        if element in self.elements:
            self.elements.remove(element)
            self.size -= 1

    def get_elements(self):
        return self.elements