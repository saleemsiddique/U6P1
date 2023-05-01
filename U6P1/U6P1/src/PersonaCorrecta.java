public class PersonaCorrecta {
    String nombre;
    int edad;
    String numeroTelefono;


    public PersonaCorrecta(String nombre, int edad, String numeroTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + ", edad=" + edad + ", numeroTelefono='" + numeroTelefono + '}';
    }
}
