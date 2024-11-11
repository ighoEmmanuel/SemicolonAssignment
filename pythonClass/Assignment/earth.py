import math

r = 6371.01

latitude = math.radians(float(input("Enter the  latitude of the first point  in degrees: ")))
longitude = math.radians(float(input("Enter the longitude of first point in degrees: ")))
latitude2 = math.radians(float(input("Enter the latitude of the second point in degrees: ")))
longitude2 = math.radians(float(input("Enter the longitude of  second point degrees: ")))

dlongitude = longitude2 - longitude
dlatitude = latitude2 - latitude
a = math.sin(dlatitude/2)*2 + math.cos(lat1) * math.cos(lat2) * math.sin(dlongitude/2)*2
c = 2 * math.atan2(math.sqrt(a), math.sqrt(1-a))
distance = r * c
print(f"Distance between points: {distance:.3f} kilometers")  