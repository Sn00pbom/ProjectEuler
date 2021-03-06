def isPrime(number):
    factors = 0
    for x in range(1,number+1):
        remain = number%x
        if remain == 0:
            factors = factors + 1
    if factors == 2:
        return True
    else:
        return False
def getPrimesSlow(n):
    curr = 1
    primes = []
    while curr <=n:

        if isPrime(curr):
            if n % curr == 0:
                primes.append(curr)

        curr += 1
    return primes
def SieveOfEratosthenes(n):

    primes = []
    # Create a boolean array "prime[0..n]" and initialize
    #  all entries it as true. A value in prime[i] will
    # finally be false if i is Not a prime, else true.
    prime = [True for i in range(n+1)]
    p = 2
    while (p * p <= n):

        # If prime[p] is not changed, then it is a prime
        if (prime[p] == True):

            # Update all multiples of p
            for i in range(p * 2, n+1, p):
                prime[i] = False
        p += 1
    for p in range(2, n):
        if prime[p]:
            primes.append(p)

    return primes
