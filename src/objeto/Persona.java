package objeto;

public class Persona {
    //Variables privadas(encapsulamiento)
    private String nombre;
    private String apellido;
    private Integer dni;
    private String instrumento;

    public Persona(){
        //Esto es un constructor vacío.
    }

    //Esto es un constructor
    public Persona(String nombre, String apellido, Integer dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //Esto es un constructor
    public Persona(String nombre, String instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    //Método con retorno.
    public String tocarInstrumento(String instrumento) {
        this.instrumento = instrumento;
        return instrumento;
    }

    //Método vacío.
    public void tocarInstrumento2(String instrumento) {
        System.out.println(instrumento);
    }

    // Métodos (vacios y con retorno)
    // Sobre carga de métodos
    // Getters y Setters
}

//Orden del código
//Clases
//Variables Privadas
//Constructores
//Getters
//Setters
//Métodos (vacíos o con retorno)