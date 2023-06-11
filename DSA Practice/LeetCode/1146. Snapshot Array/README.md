# 1146. Snapshot Array

Implement a SnapshotArray that supports the following interface:

- SnapshotArray(int length) initializes an array-like data structure with the given length. Initially, each element equals 0.
- void set(index, val) sets the element at the given index to be equal to val.
- int snap() takes a snapshot of the array and returns the snap_id: the total number of times we called snap() minus 1.
- int get(index, snap_id) returns the value at the given index, at the time we took the snapshot with the given snap_id

[Link](https://leetcode.com/problems/snapshot-array/description/)

## Approach

Tried with dictionary got mle so solved using the editorial guidance

Approach: Binary Search

![DSA Practice\LeetCode\ss\1146.png](/DSA%20Practice/LeetCode/ss/1146.png)

Intuition
One alternative is to focus on the historical record of each element, and record the value of the modified element when set is called. This approach will reduce the memory required to store the history of the array's elements and improve query times for specific snapshots since we save an element nums[i] only when it is modified by set.


To implement this approach, we can create a list of records for each index i. A record contains the snapshot id and the value of the element in that snapshot, in the format of (snap_id, nums[i]). We can then store the list of records of each element in a dictionary history_records, where the key is i. Take a look at how we update the historical record of nums[0] in history_records[0].


We have collected every record of nums[0] in history_records[0].



To retrieve the value of nums[0] with the given snapshot id snap_id = 2, we need to find the insertion position of snap_id in the list of records for nums[0]. It should be noted that snap_id may not be present in the record list. Therefore, we can use binary search to find the record with the highest snapshot ID that is less than or equal to the given snap_id.

Note that snap_id = 2 is not included in the historical record of nums[0], as set was not called on this element when the snapshot ID was 2. Therefore, the value of nums[0] remains the same as it was when the snapshot ID was 1.


Once we have the index of the target ID snap_index, we can retrieve the corresponding value from the record at the position snap_index, which is history_records[0][snap_index][1].


## Algorithm

- For each element nums[i] in the array, create an empty list to store its historical values, in the format of [snap_id, value]. Initialize each list by adding the first record [0, 0].

- Implement the set(index, val) method: add the historical record [snap_id, value] to the record list history_records[index].

- Implement the snap method: return snap_id and increment it by 1.

- Implement the get(index, snap_id) method to retrieve the value of nums[index] in the array with snapshot id as snap_id:

    - Use binary search to find the rightmost insertion index of snapshot ID in the given version snap_index (so the target index is snap_idnex - 1). (in python it can be done using bisect.bisect_right)
    - Return history_records[index][snap_index - 1][1].