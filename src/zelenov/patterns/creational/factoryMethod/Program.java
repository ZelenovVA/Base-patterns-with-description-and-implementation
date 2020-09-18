package zelenov.patterns.creational.factoryMethod;

public class Program {
    public static void main(String[] args) {
        Developer developer=DeveloperFactory.createDeveloper("cpp");
        developer.writeCode();
    }
}
