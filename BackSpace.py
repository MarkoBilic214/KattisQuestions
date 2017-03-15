string = raw_input()
new =[]
for i in xrange(len(string)):
    if string[i]=='<':
        new.pop()
    else:
        new.append(string[i])

print ''.join(new)