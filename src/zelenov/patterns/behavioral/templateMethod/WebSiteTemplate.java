package zelenov.patterns.behavioral.templateMethod;

public abstract class WebSiteTemplate {
    void showPage(){
        System.out.println("Header");
        this.showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
