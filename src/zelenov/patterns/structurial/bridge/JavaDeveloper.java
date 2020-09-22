package zelenov.patterns.structurial.bridge;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Developer writes Java code");
    }
}
