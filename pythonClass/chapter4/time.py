def seconds_since_midnight(hour, minutes, seconds):

	hour_in_seconds = (hour * (60 * 3600)) ** 2

	minute_in_seconds  = minutes * 3600
	return hour_in_seconds + minute_in_seconds + seconds

hour = int(input("Enter hours:"))
minutes = int(input("Enter minutes:"))
seconds = int(input("Enter seconds:"))

print(seconds_since_midnight(hour, minutes, seconds))