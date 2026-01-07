import java.util.Arrays;
import java.util.List;

public class ServicioCartelera {
    public List<Pelicula> obtenerCartelera(String sucursal){
        System.out.println("Obteniendo la cartelera para la sucursal: "+sucursal);
        return Arrays.asList(new Pelicula("PPP", 17, "Sala A1"), new Pelicula("TTT", 16, "Sala A2"), new Pelicula("YYY", 19, "Sala B1"));
    }

}
