import random
def get_answer(start, end):
	total = 10
	passed = 0
	failed = 0
	sign = "-"
	for count in range(10):
		random_number_one = random.randint(start, end)
		random_number_two = random.randint(start, end)
		if random_number_one > random_number_two:
			response = int(input(f"{random_number_one} {sign} {random_number_two}:"))
			answer = random_number_one - random_number_two
			if response == answer:
				passed += 1
			else:
				failed += 1			
	return (f"you passed {passed}/{total}  and failed {total - passed}/{total}")

print(get_answer(1, 100))
	

