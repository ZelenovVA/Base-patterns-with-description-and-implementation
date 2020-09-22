package zelenov.patterns.structurial.adapter;

public class AdapterJavaToDB extends JavaApp implements Datebase {
    @Override
    public void insert() {
        loadObj();
    }

    @Override
    public void update() {
        updateObj();
    }

    @Override
    public void create() {
        saveObj();
    }

    @Override
    public void delete() {
        deleteObj();
    }
}
