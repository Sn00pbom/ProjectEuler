
from functools import reduce

def factors(n):
    return set(reduce(list.__add__,
                ([i, n//i] for i in range(1, int(pow(n, 0.5) + 1)) if n % i == 0)))
def triangleNum(n):
    num = 0
    for x in range(0,n+1):
        num = num + x

    return num

def getNumFactors(num):
    return len(factors(num))
    # factors = 0
    # for x in range(1,num+1):
    #     if num%x == 0:
    #         factors = factors + 1
    # return factors

def compute():
    solved = False
    n = 1
    while solved == False:
        if getNumFactors(triangleNum(n)) >500:
            solved == True
            print triangleNum(n)
            break
        else:
            n = n+1

compute()
