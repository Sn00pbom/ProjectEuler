import inflect
from Tools import Stringtool

out = 0
words = []
p = inflect.engine()
validChars = "abcdefghijklmnopqrstuvwxyz"
for x in range(1,1001):
    words.append(p.number_to_words(str(x)))

for y in words:

    y = Stringtool.formString(y,validChars)
    out = out + len(y)
print out
