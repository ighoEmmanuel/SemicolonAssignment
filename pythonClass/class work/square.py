import math
def divide_or_square(number):
	if type(number) in [int,float]:
		if number % 5 == 0: 
			return round(math.sqrt(abs(number)), 2)

		if number != 0 :
			return number / 5
	raise TypeError




def get_future_investment(investment_amount, monthly_interest_rate, years):
	months = round(years / 12, 1)
	return round (investment_amount * ((1 + abs(monthly_interest_rate)) ** months),1)
		

	



