public class Cita {
    private String fecha;
    private String motivo;
    
    public Cita(String fecha, String motivo) {
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita [fecha=" + fecha + ", motivo=" + motivo + "]";
    }

    
}
