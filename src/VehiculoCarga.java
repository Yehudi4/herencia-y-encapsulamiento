// Clase VehiculoCarga
public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;
    //constructor de la clase vehiculoCarga
    public VehiculoCarga(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }
    //getter y setter
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
    }
    //metodo para realizar mantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de vehículo de carga...");
    }
    //metodo para calcular el costo de mantenimiento
    public double calcularCostoMantenimiento(double costoPorKm, double kilometrosRecorridos) {
        return costoPorKm * kilometrosRecorridos;
    }
}

