package zelenov.patterns.creational.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        Developer developer=DeveloperFactory.createDeveloper("cpp");
        developer.writeCode();
    }
}
