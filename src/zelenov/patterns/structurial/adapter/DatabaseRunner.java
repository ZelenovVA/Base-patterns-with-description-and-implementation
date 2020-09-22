package zelenov.patterns.structurial.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Datebase datebase=new AdapterJavaToDB();
        datebase.create();
        datebase.delete();
        datebase.insert();
        datebase.update();
    }

}
