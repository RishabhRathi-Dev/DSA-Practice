class Solution:
    def trap(self, height: List[int]) -> int:
        """
        leftGate = 0
        pointer = 0
        water = 0
        ac = 0
        nextMax = 0
        while (pointer < len(height)):
            pwater = height[pointer]
            lwater = height[leftGate]

            #print(lwater, pwater, ac, water)
            #print(height)

            nextMax = max(nextMax, pwater)

            if lwater > pwater:
                ac += lwater - pwater

            else:
                for i in range(leftGate, pointer):
                    height[i] = 0

                leftGate = pointer
                water += ac
                ac = 0

            if pointer == len(height) - 1:
                height[leftGate] = nextMax
                nextMax = 0

                if height[leftGate] == nextMax:
                    leftGate += 1

                pointer = leftGate
                ac = 0

            pointer += 1

            

        return water
        
        """

        left = 0
        right = len(height) - 1
        left_max = right_max = water = 0

        while left < right:
            if height[left] < height[right]:
                if height[left] >= left_max:
                    left_max = height[left]
                else:
                    water += left_max - height[left]
                left += 1
            else:
                if height[right] >= right_max:
                    right_max = height[right]
                else:
                    water += right_max - height[right]
                right -= 1

        return water