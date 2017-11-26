package patterns.creational.singleton;

/**
 * 1 very basic way and no synchronisation needed; But this is eager instantiation.
 */
public class SingletonClassEager {

    private static final SingletonClassEager instance = new SingletonClassEager();
    private SingletonClassEager(){}

    public static SingletonClassEager getInstance() {
        return instance;
    }
}
