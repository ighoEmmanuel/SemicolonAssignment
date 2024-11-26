class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return f"{self.name} - ${self.price}"



laptop = Product("Laptop", 1000)
phone = Product("Phone", 500)
headphones = Product("Headphones", 100)

product_catalogue = [laptop, phone, headphones]


def view_products():
    """Displays the product catalogue."""
    print("\nProduct Catalogue:")
    for product in product_catalogue:
        print(product)


def add_to_cart(cart, product_name):
    for product in product_catalogue:
        if product.name.lower() == product_name.lower():
            cart.append(product)
            print(f"{product.name} has been added to your cart.")
            return
    print(f"{product_name} not found in the product catalogue.")


def remove_from_cart(cart, product_name):
    for product in cart:
        if product.name.lower() == product_name.lower():
            cart.remove(product)
            print(f"{product.name} has been removed from your cart.")
            return
    print(f"{product_name} not found in your cart.")


def view_cart(cart):
    if not cart:
        print("Your cart is currently empty.")
    else:
        print("\nYour Shopping Cart:")
        for product in cart:
            print(product)


def calculate_total(cart):
    return sum(product.price for product in cart)


def checkout(cart):
    """Checks out the cart and clears it."""
    if cart:
        total = calculate_total(cart)
        print(f"\nThank you for shopping with us! Your total is ${total}.")
        cart.clear()
    else:
        print("\nYour cart is empty. Please add items to your cart before checkout.")


def menu():
    cart = []
    while True:
        print("\nWelcome to Jessica's E-Store!")
        print("1. View Products")
        print("2. Add to Cart")
        print("3. Remove from Cart")
        print("4. View Cart")
        print("5. Checkout")
        print("6. Exit")
        choice = input("Choose an option: ")

        match choice:
            case "1":
                view_products()
            case "2":
                product_name = input("Enter the product name to add to cart: ")
                add_to_cart(cart, product_name)
            case "3":
                product_name = input("Enter the product name to remove from cart: ")
                remove_from_cart(cart, product_name)
            case "4":
                view_cart(cart)
            case "5":
                checkout(cart)
            case "6":
                print("Thank you for visiting Jessica's E-Store!")
                break
            case _:
                print("Invalid option. Please choose again.")



menu()
