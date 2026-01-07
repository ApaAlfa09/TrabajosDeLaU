public class Pelicula{

    private String titulo;
    private int horario;
    private String sala;
    
    public Pelicula(String titulo, int horario, String sala) {
        this.titulo = titulo;
        this.horario = horario;
        this.sala = sala;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getHorario() {
        return horario;
    }
    public String getSala() {
        return sala;
    }
}