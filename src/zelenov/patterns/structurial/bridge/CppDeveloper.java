package zelenov.patterns.structurial.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Developer write C== code...");
    }
}
