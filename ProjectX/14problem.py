from Tools import Mergesort

count = 0
combos = [] #array of combo
chainlengths = [] #array of ints
def calculate(n):
    global count

    if n != 1:
        if n%2 == 0:
            n = n/2
        else:
            n = 3*n+1
        count = count + 1
        calculate(n)
        #print "test"
    else:
        count = count + 1
        #print count
        c = count
        return c
def findNum(stop):
    global count
    global combos
    global chainlengths
    for x in range(1,stop):
        count = 0
        calculate(x)
        #print(count)
        combos.append(Combo(x,count))
        chainlengths.append(count)


def findComboByLeng(leng):
    for x in range(0, len(combos)):
        if combos[x].cleng == leng:
            return combos[x]


class Combo:
    def __init__(self,number,chainlength):
        self.num = number
        self.cleng = chainlength


# calculate(13)


# calculate(13)
findNum(1000000)
Mergesort.merge_sort(chainlengths)
#print chainlengths
topLeng = chainlengths[len(chainlengths)-1]
print(findComboByLeng(topLeng).num)
