# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
nums = []
match = False
num = 1


def check(number):
    count = 0
    for x in range(1,20):
        if number%x != 0:
            #print (str(number) + " not match")
            return False
    return True

def run():
    while match == False:
        if check(num):
            print(str(num) + " Match")
            break
        num = num + 1

#print(check(2521))
run(num)
