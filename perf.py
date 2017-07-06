# -*- encoding: utf-8 -*-
import sys
import time
import math

start = time.time()

n = int(sys.argv[1])

i = 1
total = 0
while i <= n:
    total += math.log(i, 2)
    i += 1

elapsed = time.time() - start

print("Python: {:.9f}s\t{}".format(elapsed, total))
