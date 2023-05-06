# 11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

[Link](https://leetcode.com/problems/container-with-most-water/)

## Approach

Two pointer 

    We begin with
    left = 0
    right = len - 1

    now we iterate till left is < right

    water = 0

    now we want max water so
    water = max(
        water,
        area = right - left (width) * min height {as the min height one will hold the water}
    )

    now if height left < right:
        we move left forward to add more

        else:
            right comes back


now lets dry run a solution

    height = [1,8,6,2,5,4,8,3,7]

    left = 0, right = len - 1 (8), water = 0

    water = 1 * 8 = 8

    left++

    water = 8 or 7 * 7 = 49

    right--

    water = 49 or 6 * 3 = 24

    right--

    water = 49 or 5 * 8 = 40

    right--

    water = 49 or 4 * 4 = 16

    right--

    water = 49 or 3 * 5 = 15

    right--

    water = 49 or 2 * 2 = 4

    right--

    water = 49 or 1 * 6 = 6

    right --

    loop end

    water = 49 -> answer
