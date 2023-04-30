class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        power = 0
        num = 0
        for i in digits[::-1]:
            num += i*10**power
            power+=1

        num += 1

        return [int(i) for i in str(num)]