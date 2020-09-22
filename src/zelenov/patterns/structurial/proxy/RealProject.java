package zelenov.patterns.structurial.proxy;

public class RealProject implements Project {

    private String url;

    @Override
    public void run() {

    }

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from URL "+url);
        System.out.println("Running project");
    }
}
