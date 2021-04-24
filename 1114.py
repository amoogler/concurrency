class Foo:
    def __init__(self):
        self.x = 0
        pass

    def first(self, printFirst: 'Callable[[], None]') -> None:
        printFirst()
        self.x += 1

    def second(self, printSecond: 'Callable[[], None]') -> None:
        while self.x < 1:
            pass
        printSecond()
        self.x += 1

    def third(self, printThird: 'Callable[[], None]') -> None:
        while self.x < 2:
            pass
        printThird()
