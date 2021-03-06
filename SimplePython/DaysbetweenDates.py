
# Changes to work for any test case and including the exact number of days and
# consider leap years

def isLeapYear(year):
    if year% 400 == 0:
        return True
    elif year % 100 == 0:
        return False
    elif year % 4 == 0:
        return True
    else:
        return False


def nextDay(year, month, day):
    """Simple version: assume every month has 30 days"""
    if (month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10):
        if day < 31:
            return year, month, day + 1
        else:
            return year, month + 1, 1
    elif (month == 4 or month == 6 or month == 9 or month == 11):
        if day < 30:
            return year, month, day + 1
        else:
            return year, month + 1, 1
    elif (month == 12):
        if day < 31:
            return year, month, day + 1
        else:
            return year + 1, 1, 1
    elif (month == 2):
        if isLeapYear(year):
            if day < 29:
                return year, month, day + 1
            else:
                return year, month + 1, 1
        else:
            if day < 28:
                return year, month, day + 1
            else:
                return year, month + 1, 1


def dateIsBefore(year1, month1, day1, year2, month2, day2):
    """Returns True if year1-month1-day1 is before year2-month2-day2. Otherwise, returns False."""
    if year1 < year2:
        return True
    if year1 == year2:
        if month1 < month2:
            return True
        if month1 == month2:
            return day1 < day2
    return False


def daysBetweenDates(year1, month1, day1, year2, month2, day2):
    """Returns the number of days between year1/month1/day1
       and year2/month2/day2. Assumes inputs are valid dates
       in Gregorian calendar."""
    # program defensively! Add an assertion if the input is not valid!
    assert not dateIsBefore(year2, month2, day2, year1, month1, day1)
    days = 0
    while dateIsBefore(year1, month1, day1, year2, month2, day2):
        year1, month1, day1 = nextDay(year1, month1, day1)
        days += 1
    return days


def test():
    test_cases = [
        ((2012, 1, 1, 2012, 3, 1), 60),
        ((2011, 6, 30, 2012, 6, 30), 366),
        ((2011, 1, 1, 2012, 8, 8), 585),
        ((1900, 1, 1, 1999, 12, 31), 36523)]

    for (args, answer) in test_cases:
        result = daysBetweenDates(*args)
        if result != answer:
            print "Test with data:", args, "failed", result
        else:
            print "Test case passed!"


test()
