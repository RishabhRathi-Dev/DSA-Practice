class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closing_set = {'(':')', '{':'}', '[':']'}
        closing = ')}]'

        for i in s:
            if i in closing:

                if len(stack) == 0:
                    return False

                temp = stack.pop()
                if closing_set[temp] != i:
                    return False

            else:
                stack.append(i)


        if len(stack) > 0:
            return False

        return True