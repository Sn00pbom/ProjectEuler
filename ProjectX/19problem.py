# 1-7 is days of week

class Date:
    def __init__(self,year,month,day):
        self.year = year
        self.month = month
        self.day = day
    def isLeap():
        century = False
        leap = False
        if self.year % 100 == 0:
            century = True
        if century == False:
            if self.year % 4 == 0:
                leap == True
        else:
            if self.year % 400 == 0:
                leap == True
        if leap:
            print "Leapyear!"
        return leap


date = Date(2000,3,12)
print str(date.isLeap)
