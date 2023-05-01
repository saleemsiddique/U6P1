import java.util.List;

public class ProfesorCorrecto extends PersonaCorrecta{
    List<Prestamo> prestamos;

    public ProfesorCorrecto(String nombre, int edad, String numeroTelefono, List<Prestamo> prestamos) {
        super(nombre, edad, numeroTelefono);
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return
                ", nombre='" + nombre + ", edad=" + edad + ", numeroTelefono='" + numeroTelefono + ", prestamos=" + prestamos;
    }
}
