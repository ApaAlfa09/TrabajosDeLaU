public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player("Josue");

        game.addPlayer(player);
        game.addPlayer(player);
        game.addPlayer(player);
        game.addPlayer(player);
        game.addPlayer(player);

        System.out.println("Jugadores agregados");
        for (Player players : game.getPlayers()) {
            System.out.println(players.getName());
        }
    }
}
