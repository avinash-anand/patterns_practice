package patterns.creational.singleton;

/**
 * this is lazy initialization on-demand holder class idiom - as described in effective java
 */
public class SingletonClassBillPugh {

    private SingletonClassBillPugh(){}

    private static class SingletonClassBillPughHolder {
        private static final SingletonClassBillPugh instance = new SingletonClassBillPugh();
    }

    //When getInstance is called first time, this nested class is initialized
    public static SingletonClassBillPugh getInstance() {
        return SingletonClassBillPughHolder.instance;
    }

}
