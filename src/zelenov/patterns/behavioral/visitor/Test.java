package zelenov.patterns.behavioral.visitor;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.createTest(this);
    }
}
