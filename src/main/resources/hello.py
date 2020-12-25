class Solution:

    @staticmethod
    def move_zero(nums: [int]) -> [int]:
        i = 0
        while i < len(nums):
            if nums[i] == 0 and nums.count(0) < len(nums) - i:
                nums.pop(i)
                nums.append(0)
                i = 0
            else:
                i = i + 1
        return nums


r = Solution().move_zero([0, 1, 0, 3, 12])
print(r)

