class SnapshotArray:

    def __init__(self, length: int):
        self.m = [[[0, 0]] for i in range(length)]
        self.snapId = 0
        
    def set(self, index: int, val: int) -> None:
        self.m[index].append([self.snapId, val])

    def snap(self) -> int:
        self.snapId += 1
        return self.snapId - 1

    def get(self, index: int, snap_id: int) -> int:
        history = self.m[index]
        ind = bisect.bisect_right([entry[0] for entry in history], snap_id) # Binary Searching for element after which we can insert
        return history[ind-1][1]

        


# Your SnapshotArray object will be instantiated and called as such:
# obj = SnapshotArray(length)
# obj.set(index,val)
# param_2 = obj.snap()
# param_3 = obj.get(index,snap_id)