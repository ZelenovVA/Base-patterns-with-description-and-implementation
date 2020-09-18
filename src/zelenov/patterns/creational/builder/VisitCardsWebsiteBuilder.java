package zelenov.patterns.creational.builder;

public class VisitCardsWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("VisitCards");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
