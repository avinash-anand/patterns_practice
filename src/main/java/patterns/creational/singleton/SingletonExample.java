package patterns.creational.singleton;

public class SingletonExample {

    public static void main(String[] args) {
        SingletonClassEager sce1 = SingletonClassEager.getInstance();
        SingletonClassEager sce2 = SingletonClassEager.getInstance();
        System.out.println("[SingletonClassEager] - both instances are same ? - " + (sce1 == sce2));
        SingletonClassLazy scl1 = SingletonClassLazy.getInstance();
        SingletonClassLazy scl2 = SingletonClassLazy.getInstance();
        System.out.println("[SingletonClassLazy] - both instances are same ? - " + (scl1 == scl2));
        SingletonClassThreadSafe scts1 = SingletonClassThreadSafe.getInstance();
        SingletonClassThreadSafe scts2 = SingletonClassThreadSafe.getInstance();
        System.out.println("[SingletonClassThreadSafe] - both instances are same ? - " + (scts1 == scts2));
        SingletonClassThreadSafeFaster sctsf1 = SingletonClassThreadSafeFaster.getInstance();
        SingletonClassThreadSafeFaster sctsf2 = SingletonClassThreadSafeFaster.getInstance();
        System.out.println("[SingletonClassThreadSafeFaster] - both instances are same ? - " + (sctsf1 == sctsf2));
        SingletonClassBillPugh scbp1 = SingletonClassBillPugh.getInstance();
        SingletonClassBillPugh scbp2 = SingletonClassBillPugh.getInstance();
        System.out.println("[SingletonClassBillPugh] - both instances are same ? - " + (scbp1 == scbp2));
    }

}
