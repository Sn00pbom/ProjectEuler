#600851475143
globalfact = []

def isPrime(number):
    factors = 0
    for x in range(1,number):
        if (number/x).isInteger() == True:
            factors = factors + 1

    if factors == 2:
        return true
    else:
        return false
def getfactors(number):
    for x in range(1,number):
        outnum = number/x
        if isPrime(outnum):
            globalfact.append(x)


#getfactors(600851475143)
#print(globalfact[globalfact.__sizeof__-1])
for x in range(0,600851475143):
    print("hi")
