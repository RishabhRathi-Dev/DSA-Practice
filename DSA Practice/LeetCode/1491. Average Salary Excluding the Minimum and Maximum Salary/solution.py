class Solution:
    def average(self, salary: List[int]) -> float:
        ma = max(salary)
        mi = min(salary)

        s = 0
        c = 0

        for i in salary:
            if i == ma or i == mi:
                continue

            s += i
            c += 1
        
        s /= c

        return s