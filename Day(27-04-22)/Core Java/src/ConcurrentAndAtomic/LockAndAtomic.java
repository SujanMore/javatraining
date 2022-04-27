package ConcurrentAndAtomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndAtomic {

    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    private AtomicInteger k = new AtomicInteger();
    private AtomicInteger l = new AtomicInteger();

    public void incrementI(){
        lockForI.lock();    //Get Lock for I
        i++;
        lockForI.unlock();  //Release Lock for I
    }

    public void incrementJ(){
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public void incrementK(){
        k.incrementAndGet();
    }

    public void incrementL(){
        l.incrementAndGet();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public Lock getLockForI() {
        return lockForI;
    }

    public Lock getLockForJ() {
        return lockForJ;
    }

    public AtomicInteger getK() {
        return k;
    }

    public AtomicInteger getL() {
        return l;
    }
}
