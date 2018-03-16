# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
#
# a**2 + b**2 = c**2
# For example, 3**2 + 4**2 = 9 + 16 = 25 = 5**2.
#
# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.




def findTriplet():
    triplet = []
    for c in range(1,1000):
        for b in range(1,1000):
            for a in range(1,1000):
                if a**2 + b**2 == c**2:
                    if a<b:
                        if b<c:
                            if a + b + c == 1000:
                                triplet = [a,b,c]
                                print triplet
                                return triplet

triplet = findTriplet()
print str(triplet[0]*triplet[1]+triplet[2])
