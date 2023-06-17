class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        matrix[:] = matrix[::-1] # Deep Copy
        
        for i in range(len(matrix)):
	        for j in range(i):
		        matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j] 
        
        print(matrix)
        return matrix