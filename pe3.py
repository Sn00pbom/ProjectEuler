from ProjectX.Tools.Primes import getPrimesSlow
from ProjectX.Tools.Primes import SieveOfEratosthenes

NUM = 600851475143
# NUM = 13195
primes = SieveOfEratosthenes(NUM)
# primes = getPrimesSlow(NUM)
print primes
print primes[len(primes)-1]