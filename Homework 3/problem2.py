def report(xs):
    firstnames = []
    names = []
    total = 0
    for value in xs:
        if isinstance(value, str):
            names.append(value)
        if isinstance(value, int):
            total = total + value
            names.pop()
            if len(names) == 1:
                firstnames.append(names[0])
                while len(names) != 0:
                    names.pop()
            if len(names) >= 1:
                concatname = names[0]
                for i in range(1,len(names)):
                    concatname = concatname + " "
                    concatname = concatname + names[i]
                firstnames.append(concatname)
                while len(names) != 0:
                    names.pop()
    average = total/len(firstnames)
    averaged = "averaged " + str(average)
    for i in firstnames:
        print(i, end=", ")
    print(averaged, end=".")

            
report(["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", 94, "Bobbie", "Sue", "Palmer", 72])
