package zelenov.patterns.creational.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        singleton.sayHello();
    }
}
