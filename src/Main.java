public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Renault", "Stepway", "2020", 60000000);
        Auto auto2 = new Auto("Toyota", "Prado", "2023", 250000000);

        Cliente cliente1 = new Cliente("Osneris", "3213456");
        Cliente cliente2 = new Cliente("Ingrid", "3213456");

        Concesionario concesionario = new Concesionario();


        concesionario.agregarAutos(auto1);
        concesionario.agregarAutos(auto2);

        concesionario.agregarClientes(cliente1);
        concesionario.agregarClientes(cliente2);


        System.out.println(concesionario.mostrarAutosDisponibles());

        Venta venta1 = new Venta(cliente1, auto2);
        System.out.println(venta1.getAuto().getMarca());
        System.out.println(venta1.getCliente().getNombre());

        System.out.println(concesionario.mostrarClientesRegistrados());
    }
}