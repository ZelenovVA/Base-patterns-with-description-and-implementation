package zelenov.patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton (){};
    public synchronized static Singleton getInstance(){
        if (instance==null) instance=new Singleton();
        return instance;
    }

    void sayHello(){
        System.out.println("Hello from singleton");
    }
}
