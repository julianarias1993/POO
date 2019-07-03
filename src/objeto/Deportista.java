package objeto;

public class Deportista extends Persona {
    private String deporte;
    private String rendimiento;
    
    public Deportista(String nombre, String apellido, Integer dni, String deporte, String rendimiento) {
        super(nombre, apellido, dni);
        this.deporte = deporte;
        this.rendimiento = rendimiento;
    }
}