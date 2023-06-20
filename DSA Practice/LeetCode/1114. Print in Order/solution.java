class Foo {
    private Lock lock = new ReentrantLock();
    private Condition secondCondition = lock.newCondition();
    private Condition thirdCondition = lock.newCondition();
    private boolean secondExecuted = false;
    private boolean thirdExecuted = false;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            secondExecuted = true;
            secondCondition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try {
            while (!secondExecuted) {
                secondCondition.await();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            thirdExecuted = true;
            thirdCondition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (!thirdExecuted) {
                thirdCondition.await();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        } finally {
            lock.unlock();
        }
    }
}