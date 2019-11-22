package Service;

public class Context {
    private IStrategy istrategy;

    public Context(IStrategy istrategy) {
        this.istrategy = istrategy;
    }

    public void operate(){
        this.istrategy.operate();
    }
}
