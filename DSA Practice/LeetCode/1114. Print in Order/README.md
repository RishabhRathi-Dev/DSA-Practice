# 1114. Print in Order

Suppose we have a class:

    public class Foo {
    public void first() { print("first"); }
    public void second() { print("second"); }
    public void third() { print("third"); }
    }
The same instance of Foo will be passed to three different threads. Thread A will call first(), thread B will call second(), and thread C will call third(). Design a mechanism and modify the program to ensure that second() is executed after first(), and third() is executed after second().

Note:

We do not know how the threads will be scheduled in the operating system, even though the numbers in the input seem to imply the ordering. The input format you see is mainly to ensure our tests' comprehensiveness.

 
[Link](https://leetcode.com/problems/print-in-order/description/)

## Approach

Lock all (by acquiring the locks) except 1st -> 1st done then open 2nd lock (by releaseing the lock)-> 2nd done open 3rd lock -> 3rd done