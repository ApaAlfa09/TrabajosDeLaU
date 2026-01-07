public interface WheatherStation {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();

}
