from ExtraWork.diaryapp.diaries import Diaries

diaries = Diaries()

def create_diary():
    try:
        user_name = input("Enter your username: ")
        password = input("Enter your password: ")
        diaries.add_diary(user_name, password)
        print("Diary created successfully")
    except ValueError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    finally:
        main_menu()


def create_entry(diary):
    try:
        title = input("Enter your title: ")
        content = input("Enter your content: ")
        diary.create_entry(title, content)
    except ValueError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    finally:
        log_in_options(diary)


def update_entry(diary):
    try:
        id_number = int(input("Enter your ID: "))
        title = input("Enter your title: ")
        content = input("Enter your content: ")
        diary.update_entry(id_number, title, content)
    except ValueError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    finally:
        log_in_options(diary)


def delete_entry(diary):
    try:
        id_number = int(input("Enter your ID: "))
        diary.delete_entry(id_number)
    except ValueError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")

    finally:
        log_in_options(diary)




def unlock_diary(diary):
    try:
        password = input("Enter your password: ")
        diary.unlock(password)
        print("Diary unlocked successfully")
    except ValueError as e:
        print(f"Error: {e}")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    finally:
        unlock_diary(diary)

def view_entries(diary):
    try:
        entries = diary.view_entries()
        if entries:
            print(entries)
        else:
            print("No entries found.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    finally:
        log_in_options(diary)


def lock_diary(diary):
    try:
        diary.lock()
        print("Diary locked successfully")
    finally:
        log_in_options(diary)


def log_in_options(diary):
        choice = input("""
        
        1. Create Entry
        2. Update Entry
        3. Delete Entry
        4. Unlock Diary
        5. View Entries
        6. Lock Diary
        7. Log Out

        Select an option: """)

        match choice:
            case "1":
                create_entry(diary)
            case "2":
                update_entry(diary)
            case "3":
                delete_entry(diary)
            case "4":
                unlock_diary(diary)
            case "5":
                view_entries(diary)

            case "6":
                lock_diary(diary)

            case "7":
                return
            case _:
                print("Invalid option. Choose between 1-7.")
                log_in_options(diary)




def log_in():
    try:
        user_name = input("Enter your username: ")
        found_diary = diaries.find_username(user_name)

        if found_diary is None:
            print("Username not found")
        else:
            password = input("Enter your password: ")
            if password != found_diary.password:
                print("Password does not match")
            else:
                found_diary.unlock(password)
                log_in_options(found_diary)

    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    finally:
        main_menu()


def delete_diary():
    try:
        user_name = input("Enter your username: ")
        found_diary = diaries.find_username(user_name)
        if found_diary is None:
            print("Username not found")
        else:
            password = input("Enter your password: ")
            if password != found_diary.password:
                print("Password does not match")
            else:
                diaries.delete(user_name, password)
                print("Diary deleted successfully")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
    finally:
        main_menu()


def main_menu():
    try:

            choice = input("""Welcome to EmmaStoneCode Diary App

        Here are what we can do:

        1. Create Diary
        2. Log In
        3. Delete Diary
        4. Exit Program

        Select from 1-4: """)

            match choice:
                case "1":
                    create_diary()
                case "2":
                    log_in()
                case "3":
                    delete_diary()
                case "4":
                    print("Thank you for using the program.")
                    exit()
                case _:
                    print("Invalid input. Please try again.")
                    main_menu()
    except Exception as e:
        print(f"Error: {e}")



if __name__ == "__main__":
    try:
        main_menu()
    except KeyboardInterrupt:
        print("\nProgram exited by user.")
    except Exception as e:
        print(f"Critical error: {e}")
