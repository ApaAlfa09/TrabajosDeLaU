public class Jugador extends Thread{
    String nombre;
    int id;
    Juego juego;
    int total;

    public Jugador(String nombre, int id, Juego juego) {
        this.nombre = nombre;
        this.id = id;
        this.juego = juego;
    }

    public String getNombre() {
        return nombre;
    }

    public int getiD() {
        return id;
    }

    public Juego getJuego() {
        return juego;
    }

    public int getTotal() {
        return total;
    }

    public void addTotal(int value){
        total += value;
    }

    @Override
    public void run() {
        try {
            while (!juego.termino) {
                juego.jugar(this);
                sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
