def factorial(num):
    for x in range(num-1,0,-1):
        num = num * x

    return num

string = str(factorial(100))

out = 0
for x in range(0,len(string)):
    out = out + int(string[x])

print out
