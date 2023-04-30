class Solution:
	def permute(self, nums: List[int]) -> List[List[int]]:
		def recursion(nums, perm=[], res=[]):
			if not nums:
				res.append(perm[::])

			for i in range(len(nums)):
				newNums = nums[:i] + nums[i+1:]
				perm.append(nums[i])
				recursion(newNums, perm, res)
				perm.pop()

			return res

		return recursion(nums)