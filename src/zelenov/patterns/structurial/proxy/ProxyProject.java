package zelenov.patterns.structurial.proxy;

public class ProxyProject implements Project {
    private String URL;
    private Project realProject;

    public ProxyProject(String URL) {
        this.URL = URL;
    }

    @Override
    public void run() {
        if (realProject==null){
            realProject=new RealProject(URL);
            realProject.run();
        }
    }
}
