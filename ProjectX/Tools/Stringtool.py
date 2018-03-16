def formString(orig, validstr):
    builder = ""
    for x in range(0,len(orig)):
        if validstr.__contains__(orig[x]):
            builder = builder + orig[x]
    return builder
