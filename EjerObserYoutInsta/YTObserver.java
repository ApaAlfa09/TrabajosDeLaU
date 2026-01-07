public class YTObserver implements Observer{

    @Override
    public void update(String message) {
        System.out.println("YouTube " + message);
    }
    
}
