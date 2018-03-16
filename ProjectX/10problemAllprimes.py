from Tools import Primes
# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
#
# Find the sum of all the primes below two million.

num = 0
# for x in range(1,2000000):
#     if Checkprime.isPrime(x):
#         num = num + x
primes = Primes.SieveOfEratosthenes(2000000)

for x in range(0,len(primes)):
    num = num + primes[x]
print num
