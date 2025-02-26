import bcrypt


USER_DETAILS = 'user_details.txt'

def hash_password(password):
    return bcrypt.hashpw(password.encode('utf-8'), bcrypt.gensalt())

def save_to_file(username, hashed_password):
    with open(USER_DETAILS, 'a') as file:
        file.write(f'{username}:{hashed_password.decode('utf-8')}\n')

def register_user():
    while True:
       username = input("Enter your username: ")
       if not username:
           print("Username can't be empty")
           continue
       break

    while True:
        password = input("Enter your password: ")
        if not password:
            print("Password can't be empty")
            continue

        break
    save_to_file(username, hash_password(password))



def validate_user(username, password):
    with open(USER_DETAILS, 'r') as file:
        for line in file:
            stored_username, stored_password = line.strip().split(':')
            print(stored_password)
            if username == stored_username:
                return bcrypt.checkpw(password.encode('utf-8'), stored_password.encode('utf-8'))

def login_user():
    username = input("Enter your username: ")
    password = input("Enter your password: ")
    if validate_user(username, password):
        print("Login successful")
    else:
        print("Invalid username or password")

def main():
    choice = input("""
    1. to register user
    2. to login user
    3 to exit""")

    match choice:
        case "1":
            register_user()
        case "2":
            login_user()
        case "3":
            print("Thank you!")
            exit()

main()

