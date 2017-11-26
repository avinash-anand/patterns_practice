package patterns.creational.singleton;

/***
 * 1 way to make lazy singleton, but this is not thread safe.
 */
public class SingletonClassLazy {

    private static SingletonClassLazy instance;
    private SingletonClassLazy(){}

    public static SingletonClassLazy getInstance() {
        if(instance == null) {
//            System.out.println("1st instance created");
            instance = new SingletonClassLazy();
        }
//        System.out.println("Returning already created instance");
        return instance;
    }


}
