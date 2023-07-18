# 146. LRU Cache

Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.

[Link](https://leetcode.com/problems/lru-cache/description/)

## Approach

HashMap + Doubly linked list

hashmap for better lookup and doubly linked list for lru

there is an api as well call LinkedHashMap which is actually the combination of the above in java.