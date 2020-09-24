package zelenov.patterns.behavioral.visitor;

public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.createDatabase(this);
    }
}
