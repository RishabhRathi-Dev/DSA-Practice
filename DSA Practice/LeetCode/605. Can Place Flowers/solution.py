class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        can = 0

        if len(flowerbed) >= 3:
            for i in range(1, len(flowerbed)-1):
                
                if i-1 == 0 and flowerbed[i] == 0 and flowerbed[i-1] == 0:
                    flowerbed[i-1] = 1
                    can += 1

                if flowerbed[i] == 0 and i+1 == len(flowerbed)-1 and flowerbed[i+1] == 0:
                    flowerbed[i+1] = 1
                    can += 1

                if flowerbed[i] == 0 and flowerbed[i-1] == 0 and flowerbed[i+1] == 0:
                    flowerbed[i] = 1
                    can += 1


                #print(flowerbed)

        else :
            if len(flowerbed) == 2 :
                if flowerbed[0] == 0 and flowerbed[1] == 0:
                    can += 1

            elif len(flowerbed) == 1:
                if flowerbed[0] == 0:
                    can += 1

        return can >= n
