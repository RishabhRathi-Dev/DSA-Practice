class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        # sorting
        people.sort()
        
        # 2 pointer low and high
        low = 0
        high = len(people)-1
        boats = 0
        while low <= high:
            if people[low] + people[high] <= limit:
                low += 1
                high -= 1
            else:
                high -= 1
            boats += 1
        return boats