class Foo {

    private volatile int count = 0;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        count++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (count < 1) {
        }
        printSecond.run();
        count++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (count < 2) {
        }
        printThird.run();
    }
}