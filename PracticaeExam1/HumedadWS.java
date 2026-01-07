import java.util.ArrayList;
import java.util.List;

public class HumedadWS implements WheatherStation{
    private String state;
    private List<Observer> listaObserver;

    public HumedadWS() {
        state = "";
        this.listaObserver = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        listaObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listaObserver.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : listaObserver) {
            observer.update(state);
        }
    }

    public void cambioHumedad(String state){
        this.state = state;
        notifyObserver();
    }
}
