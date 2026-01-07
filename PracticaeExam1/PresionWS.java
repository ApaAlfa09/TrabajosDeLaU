
import java.util.ArrayList;
import java.util.List;

public class PresionWS implements WheatherStation{
    private String state;
    private List<Observer> listaObserver;

    public PresionWS() {
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
        for(Observer obserber: listaObserver){
            obserber.update(state);
        }
    }

    public void cambioPresion(String state){
        this.state = state;
        notifyObserver();
    }
}
