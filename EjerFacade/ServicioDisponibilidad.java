public class ServicioDisponibilidad {
    public boolean verificarDisponibilidad(String pelicula, String horario, String sucursal, int cantidad){
        System.out.println("Verificando disponibilidad para: "+pelicula+", "+horario+", "+sucursal+", "+cantidad);
        return true;
    }

    public void reservarTikets(String pelicula, String horario, String sucursal, int cantidad){
        System.out.println("Reservar: "+pelicula+", "+horario+", "+sucursal+", "+cantidad);
    }
}
