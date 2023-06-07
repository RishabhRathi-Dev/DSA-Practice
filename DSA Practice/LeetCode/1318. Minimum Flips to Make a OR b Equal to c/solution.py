class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        a = str(bin(a))[2:][::-1]
        b = str(bin(b))[2:][::-1]
        c = str(bin(c))[2:][::-1]

        #print(a, b, c)

        pointer = 0
        maxlength = max(len(a), max(len(b), len(c)))

        count = 0

        while(pointer < maxlength):
            #c
            def_c = 0
            if pointer < len(c):
                def_c = int(c[pointer])

            #b
            def_b = 0
            if pointer < len(b):
                def_b = int(b[pointer])

            #a
            def_a = 0
            if pointer < len(a):
                def_a = int(a[pointer])

            if def_c:
                if def_a or def_b:
                    pointer+=1
                    continue
                else:
                    count+=1
            else:
                if def_a == 1:
                    count+=1
                if def_b == 1:
                    count+=1

            pointer+=1

        return count
        