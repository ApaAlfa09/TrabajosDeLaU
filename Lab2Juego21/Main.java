public class Main {
    public static void main(String[] args) throws InterruptedException{
        Juego juego = new Juego();
    
        Jugador jug1 = new Jugador("josu", 1, juego);
        Jugador jug2 = new Jugador("bri", 2, juego);
        Jugador jug3 = new Jugador("jona", 3, juego);
        
        jug1.start();
        jug2.start();
        jug3.start();

        jug1.join();
        jug2.join();
        jug3.join();

        System.out.println("Juego termino");
    }
}