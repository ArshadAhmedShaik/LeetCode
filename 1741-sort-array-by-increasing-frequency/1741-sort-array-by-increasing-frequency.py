from functools import cmp_to_key

class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        count = Counter(nums)
        def func(x1, x2):
             if(count[x1]==count[x2]):
                return x2 - x1 
             return count[x1] - count[x2]
        sort = sorted(nums, key = cmp_to_key(func))
        return sort