class Solution:
    def maxConsecutiveAnswers(self, answerKey: str, k: int) -> int:
                
        def longest(answers, k, search):
            best = 0
            left = 0
            for right in range(len(answers)):
                if answers[right] == search:
                    k -= 1
                while k < 0:
                    if answers[left] == search:
                        k += 1
                    left += 1
                best = max(best, right-left+1)
            return best
        
        return max( longest(answerKey, k, 'T'), longest(answerKey, k, 'F'))