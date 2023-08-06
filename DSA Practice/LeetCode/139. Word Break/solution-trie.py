class Trie:
    __slots__ = ('root',)

    class Node:
        def __init__(self, value=None):
            __slots__ = ('value', 'children', 'is_word')
            self.value = value
            self.children = {}
            self.is_word = False

    def __init__(self, values=None):
        self.root = self.Node()
        if values is not None:
            for value in values:
                self.add(value)

    def has(self, iterable):
        node = self.root
        for value in iterable:
            node = node.children.get(value)
            if not node:
                return False
        return node.is_word

    def add(self, iterable):
        node = self.root
        for value in iterable:
            next_node = node.children.get(value)
            if not next_node:
                next_node = node.children[value] = self.Node(value)
            node = next_node
        node.is_word = True

    def iter(self, generator):
        node = self.root
        for i, value in enumerate(generator):
            node = node.children.get(value)
            if not node:
                break
            yield i, node


class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        trie = Trie()
        for word in wordDict:
            trie.add(word)
        n = len(s)
        
        @cache
        def dp(index):
            if index == len(s):
                return True
            
            for i, node in trie.iter(s[k] for k in range(index, n)):
                if node.is_word and dp(index + i + 1):
                    return True

            return False
        
        return dp(0)
            