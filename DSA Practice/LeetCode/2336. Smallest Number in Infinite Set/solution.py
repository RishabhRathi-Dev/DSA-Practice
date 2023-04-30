class SmallestInfiniteSet:
    
    def __init__(self):
        self.nums = [i for i in range(1, 1001)]    

    def popSmallest(self) -> int:
        x = self.nums.pop(0)
        self.nums.sort()
        return x
        

    def addBack(self, num: int) -> None:
        if num not in self.nums:
            self.nums.append(num)
            self.nums.sort()
        


# Your SmallestInfiniteSet object will be instantiated and called as such:
# obj = SmallestInfiniteSet()
# param_1 = obj.popSmallest()
# obj.addBack(num)