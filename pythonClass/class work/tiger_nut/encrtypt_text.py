def get_number_shift(inputs: str):
    words = ""
    for char in inputs:
        if char.isalpha():
            if char.islower():
                shifted = chr((ord(char) - ord('a') + 13) % 26 + ord('a'))
            else:
                shifted = chr((ord(char) - ord('A') + 13) % 26 + ord('A'))
            words += shifted
        else:
            words += char
    return words

print(get_number_shift("mem"))
print(get_number_shift("Hello, World!"))
