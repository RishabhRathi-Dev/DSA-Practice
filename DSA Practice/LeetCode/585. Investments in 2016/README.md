# 585. Investments in 2016

[Link]()

## Approach

Partition -> 

![Partitions vs Group](/DSA%20Practice/LeetCode/ss/partitions-mysql.png)

So We do two partition 
- one on tiv_2015 to get aggregate of that
- second on lat and lon

Now the columns which have agg tiv_2015 >= 2 means they have same tiv and if cnt = 1 means its at unique location thus fullfilling the criteria