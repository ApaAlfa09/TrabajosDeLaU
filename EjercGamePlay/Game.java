import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();
    private  GameSettingSingleton settings;
    
    public Game() {
        this.settings = GameSettingSingleton.getInstance();
    }

    public boolean addPlayer(Player player){
        if (players.size() >= settings.getMaxPlayers()) {
            System.out.println("No se puede agregar mas jugadores, espacio lleno");
            return false;
        }else{
            players.add(player);
            System.out.println("Se añadio con exito al jugador");
            return true;
        }
    }
    public List<Player> getPlayers(){
        return players;
    }
}
