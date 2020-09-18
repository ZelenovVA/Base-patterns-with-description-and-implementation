package zelenov.patterns.creational.abstractFactory.banking;

import zelenov.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes banking code...");
    }
}
