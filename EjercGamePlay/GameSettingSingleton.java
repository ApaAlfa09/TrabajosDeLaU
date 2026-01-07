public class GameSettingSingleton {
    private int maxPlayer;
    private static GameSettingSingleton instance;
    
    private GameSettingSingleton(int maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    public static GameSettingSingleton getInstance(){
        if (instance == null) {
            instance = new GameSettingSingleton(4);
        }
        return instance;
    }

    public int getMaxPlayers(){
        return maxPlayer;
    }
}
