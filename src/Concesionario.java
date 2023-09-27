import java.util.ArrayList;
import java.util.List;

public class Concesionario {

    private  List<Cliente> listaDeClientes;
    private List<Auto> autosDisponibles ;
    private List<Venta> registroDeVentas;

    public Concesionario() {
        this.autosDisponibles = new ArrayList<>();
        this.listaDeClientes = new ArrayList<>();
        this.registroDeVentas = new ArrayList<>();
    }

    public String prueba(){ return "prueba";}

    public void agregarAutos(Auto auto){
        autosDisponibles.add(auto);
    }

    public void agregarClientes(Cliente cliente){
        listaDeClientes.add(cliente);
    }

    public String mostrarAutosDisponibles(){
        String auto = "";
        for (int i = 0; i < autosDisponibles.size(); i++) {
          auto += "Marca: "+ autosDisponibles.get(i).getMarca()+ " Modelo: " +autosDisponibles.get(i).getModelo() +" Anio: "+ autosDisponibles.get(i).getAnio() + "\n";

        }
       return auto;
    }

    public String mostrarClientesRegistrados(){
        String cliente = "";
        for (int i = 0; i < listaDeClientes.size(); i++) {
            cliente += "Nombre: " + listaDeClientes.get(i).getNombre() + " |Telefono: " + listaDeClientes.get(i).getTelefono();
    }
        return cliente;
    }
}
