class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        
        maximum = 0

        #Using sliding window
        
        left = 0
        right = 0
        vc = 0

        while (right < len(s)):
            # check if the rightmost character is a vowel
            if s[right] in "aeiou":
                vc += 1
            
            # check if the window size is greater than k, 
            # and update vc and left pointer accordingly
            if right - left + 1 > k:
                if s[left] in "aeiou":
                    vc -= 1
                left += 1
                
            right += 1
            
            maximum = max(vc, maximum)

        return maximum