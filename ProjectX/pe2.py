out = []
evens = []
def fib(lasta,lastb):
    out.append(lasta)
    new = lasta + lastb
    if lastb <4000000:
        fib(lastb, new)
fib(1,2)
print out
for num in out:
    if num %2 == 0:
        evens.append(num)
print sum(evens)