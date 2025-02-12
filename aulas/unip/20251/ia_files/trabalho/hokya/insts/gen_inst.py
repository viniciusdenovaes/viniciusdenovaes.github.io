n = int(input("size:"))

f = open(f"instg{n:0>2}.in", "w")
f.write(str(n))
f.write('\n')
for i in range(n):
	for j in range(n):
		f.write("0")
	f.write("\n")
f.close()
