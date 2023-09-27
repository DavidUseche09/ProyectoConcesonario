import java.util.List;

public class Cliente {
    private  String nombre;
    private String telefono;

    private List<Venta> historialVentas;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
