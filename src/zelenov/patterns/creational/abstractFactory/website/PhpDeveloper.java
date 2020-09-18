package zelenov.patterns.creational.abstractFactory.website;

import zelenov.patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer write website code...");
    }
}
