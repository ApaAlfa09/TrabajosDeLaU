import java.util.ArrayList;
import java.util.List;

public class YTSubject implements Subject{
    private String state;
    private List<Observer> listObservers;

    public YTSubject() {
        this.listObservers = new ArrayList<>();
        state = "";
    }

    @Override
    public void addObserver(Observer observer) {
        listObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : listObservers) {
            observer.update(state);
        }
    }

    public void newVideo(String state){
        this.state = state;
        notifyObservers();
    }
}
