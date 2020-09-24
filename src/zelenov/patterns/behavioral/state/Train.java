package zelenov.patterns.behavioral.state;

public class Train implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training");
    }
}
