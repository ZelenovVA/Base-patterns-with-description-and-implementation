package zelenov.patterns.creational.abstractFactory.banking;

import zelenov.patterns.creational.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
