def FunHouse():
    house =0
    while True:
        house+=1
        thing = raw_input().split(" ")
        x = int(thing[0])
        y = int(thing[1])

        if x==0 and y==0:
            break

        curx = 0
        cury = 0
        direction = 0
        matrix = []
        for j in xrange(y):
            matrix += map(None, raw_input().split())

        for j in xrange(y):
            for i in xrange(x):
                if matrix[j][i] == '*':
                    curx = i
                    cury = j
                    if i == x - 1:
                        direction = 1
                    elif j == 0:
                        direction = 2
                    elif j == y - 1:
                        direction = 3

        while True:
            if matrix[cury][curx] == "x":
                matrix[cury] = matrix[cury][:curx] + '&' + matrix[cury][curx+1:]
                break
            elif matrix[cury][curx] == "/" and direction == 0:
                direction = 3
            elif matrix[cury][curx] == "/" and direction == 1:
                direction = 2
            elif matrix[cury][curx] == "/" and direction == 2:
                direction = 1
            elif matrix[cury][curx] == "/" and direction == 3:
                direction = 0

            if matrix[cury][curx] == "\\" and direction == 0:
                direction = 2
            elif matrix[cury][curx] == "\\" and direction == 1:
                direction = 3
            elif matrix[cury][curx] == "\\" and direction == 2:
                direction = 0
            elif matrix[cury][curx] == "\\" and direction == 3:
                direction = 1

            if direction == 0:
                curx += 1
            elif direction == 1:
                curx -= 1
            elif direction == 2:
                cury += 1
            elif direction == 3:
                cury -= 1
        print "HOUSE %d" %(house)
        for j in xrange(y):
            print matrix[j]

FunHouse()
