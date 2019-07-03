package objeto;

public class Main {

    public static void main(String[] args) {
       Persona persona1 = new Persona("Julián", "Arias", 37198864);
       //System.out.println(persona1);

       String instrumento = persona1.tocarInstrumento("Guitarra");
       //System.out.println(instrumento);

       persona1.tocarInstrumento2("Armónica");

       System.out.println(persona1.getNombre());
       System.out.println(persona1.getApellido());
       System.out.println(persona1.getDni());

       Persona persona2 = new Persona();
       persona2.setNombre("Carlos");
       persona2.setApellido("Lopez");
       persona2.setDni(37179147);

       System.out.println(persona2.getNombre());
       System.out.println(persona2.getApellido());
       System.out.println(persona2.getDni());
       persona2.tocarInstrumento2("Bajo");

       Deportista deportista1 = new Deportista("alejandro", "Sanchez", 37179147, "futbolista", "alto");
    }
}