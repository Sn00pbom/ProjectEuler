num = 2**1000
string = str(num)
nums = []
out = 0;
for x in range(0,len(string)):
    nums.append(int(string[x]))
for x in range(0,len(nums)):
    out = out + nums[x]
print out
