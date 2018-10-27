def firstMissingPositive(nums):
	i = 1
	while i <= len(nums):
		if i not in nums:
			return i
		i += 1
	return i