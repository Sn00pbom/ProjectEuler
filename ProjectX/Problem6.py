# The sum of the squares of the first ten natural numbers is,
#
# 12 + 22 + ... + 102 = 385
# The square of the sum of the first ten natural numbers is,
#
# (1 + 2 + ... + 10)2 = 552 = 3025
#
# Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

num1 = 0
num2 = 0


for x in range(1,101):
    num1 = (x**2) + num1
    num2 = num2 + x
num2 = num2 ** 2
out = num2-num1
print out
