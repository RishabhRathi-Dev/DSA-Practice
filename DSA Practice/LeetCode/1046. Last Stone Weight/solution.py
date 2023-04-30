class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stack = sorted(stones)

        while (len(stack) >= 2):
            a = stack.pop()
            b = stack.pop()

            if (a != b):
                stack.append(abs(a-b))

            stack.sort()
    

        if len(stack) == 1:
            return stack.pop()

        else :
            return 0