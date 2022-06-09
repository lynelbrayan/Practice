import statistics as stat

import matplotlib.pyplot as plt

a=[5,4,6,5,3,12,5,6,34,5,4,3.4,3,5,4,5]
print(stat.mean(a))

print(stat.mode(a))

print(stat.median(a))


a={2:4,4:6,6:8}
print(stat.mean(a.keys()))
print(stat.mean(a.values()))

print(stat.mode(a))
print(stat.stdev(a.keys()))
print(stat.stdev(a.values()))

print(stat.median(a))
an=stat.linear_regression(a.keys(),a.values())

plt.scatter(an[0],an[1])

plt.show(x)