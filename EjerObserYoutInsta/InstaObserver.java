public class InstaObserver implements Observer{

    @Override
    public void update(String message) {
        System.out.println("Instagram " + message);
    }
}
