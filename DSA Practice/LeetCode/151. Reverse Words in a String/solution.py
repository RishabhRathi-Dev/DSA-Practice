class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        a = [i for i in s.split(" ") if i != " " and i != ""]
        print(a)
        return " ".join(a[::-1])
        