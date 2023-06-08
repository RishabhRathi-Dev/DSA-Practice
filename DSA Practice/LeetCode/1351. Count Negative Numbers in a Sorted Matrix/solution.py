class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        return sum([True for i in grid for j in i if j < 0])