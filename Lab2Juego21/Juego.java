public class Juego {
    int turno;
    boolean termino;

    public Juego() {
        this.turno = (int)(Math.random()*3)+1;
        this.termino = false;
    }

    public synchronized  void jugar(Jugador jugador){
        while (turno != jugador.getiD() && !termino) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
                return;
            }
        }
        
        if (termino) {
            return;
        }
        
        int valor = (int)(Math.random()*11)+1;
        System.out.println("Se sumo "+valor+" al jugador "+jugador.getNombre());
        jugador.addTotal(valor);
        System.out.println("El total de "+jugador.getNombre()+" es: "+jugador.getTotal());

        if (jugador.getTotal() == 21) {
            System.out.println(jugador.getNombre()+" Ganó");
            termino = true;
        }else if (jugador.getTotal() > 21) {
            System.out.println("Nadie gano");
            termino = true;
        }else{
            turno = (turno % 3)+1;
        }

        notifyAll();
    }
}