public class CineFacade {
    private ServicioCartelera servCartelera;
    private ServicioDisponibilidad servDisponibilidad;
    private ServicioVerificaIdentid servVerificarIdentidad;
    
    public CineFacade() {
        servCartelera = new ServicioCartelera();
        servDisponibilidad = new ServicioDisponibilidad();
        servVerificarIdentidad = new ServicioVerificaIdentid();
    }

}
