length = 4
moves = length *2
finalindex = moves-1
combo = []
combos = [[]]

def initCombo():
    for x in range(0,moves):
        combo.append(0)

def buildcombos(index):
    global finalindex
    global combo
    global combos
    index += 1
    for combo[index] in range(0,2):
        if index == finalindex:
            combos.append(combo)
        else:
            buildcombos(index)

initCombo()
buildcombos(-1)

for newcombo in combos:
    print newcombo
