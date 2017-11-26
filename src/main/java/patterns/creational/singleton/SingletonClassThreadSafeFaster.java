package patterns.creational.singleton;

/**
 * This is thread safe, but faster than other synchronised method.
 */
public class SingletonClassThreadSafeFaster {

    // need volatile, otherwise other thread can see half-initialized instance
    private volatile static SingletonClassThreadSafeFaster instance;

    private SingletonClassThreadSafeFaster() {
    }

    public static SingletonClassThreadSafeFaster getInstance() {
        if (instance == null) {
            synchronized (SingletonClassThreadSafeFaster.class) {
                instance = new SingletonClassThreadSafeFaster();
            }
        }
        return instance;
    }
}
