import random

c = 0
xmax = 3
ymax = 3
r = 0
d = 0
movements = []
movements.append(Movement(r,True))

def decide():
    for x in range(0,len(movements)):
        movement = movements[x]
        if r == movement
def makeCase():
    global r
    global d

    case = []
    while True:
        if r == xmax:
            if d == ymax:
                break
        rand = random.randint(0,1)
        if rand == 0:
            case.append("r")
            r = r + 1
        else:
            case.append("d")
            d = d + 1
    return case

def canR():
    if x + 1 > xmax:
        return false
    else:
        return true
def canD():
    if y + 1 > ymax:
        return false
    else:
        return true

def r():
    x = x +1
def d():
    y = y+1
class Movement:
    global r
    global d
    def __init__(self,direction,possible):
        self.r = r
        self.d = d
        self.direction = direction
        self.possible = possible


print makeCase()
