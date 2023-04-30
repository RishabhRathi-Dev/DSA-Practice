# 1254. Number of Closed Islands

Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.

Return the number of closed islands.

[Link](https://leetcode.com/problems/number-of-closed-islands/)

## Approach

Reverse spilling of water -> basically using dfs to go in all direction and then filling water on the land tile which we visited. Now when we get a tile which is already water then that marks the end of dfs for that direction. Using this technique we can calculate the number of closed Islands.