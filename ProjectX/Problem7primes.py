import Checkprime

print Checkprime.isPrime(6)

count = 0
num = 2
while True:
    if(Checkprime.isPrime(num)):

        count = count + 1
        if count == 10001:
            print num
            break
    num = num + 1
