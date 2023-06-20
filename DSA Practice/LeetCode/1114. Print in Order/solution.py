import threading
class Foo:
    def __init__(self):
        self.f = threading.Lock()
        self.s = threading.Lock()
        self.s.acquire()
        self.t = threading.Lock()
        self.t.acquire()

    def first(self, printFirst: 'Callable[[], None]') -> None:
        with self.f:
            # printFirst() outputs "first". Do not change or remove this line.
            printFirst()
            self.s.release()

    def second(self, printSecond: 'Callable[[], None]') -> None:
        with self.s:
            # printSecond() outputs "second". Do not change or remove this line.
            printSecond()
            self.t.release()

    def third(self, printThird: 'Callable[[], None]') -> None:
        with self.t:
            # printThird() outputs "third". Do not change or remove this line.
            printThird()