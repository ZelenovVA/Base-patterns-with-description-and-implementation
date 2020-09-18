package zelenov.patterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director=new Director();
        director.setBuilder(new VisitCardsWebsiteBuilder());
        director.buildWebsite();
    }
}
