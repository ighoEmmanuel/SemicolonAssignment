day = int(input("Enter today's day:"))
future_date = int(input("Enter the number of days elapsed since today:"))





match day:
	case 0:
		print("Today is Sunday")
	case 1:
		print("Today is Monday")
	case 2:
		print("Today is Tuesday")
	case 3:
		print("Today is Wednesday")
	case 4:
		print("Today is Thursday")
	case 5:
		print("Today is Friday")
	case 6:
		print("Today is Saturday")
	case _:
		print("Invalid input")