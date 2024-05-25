// Clase VehiculoPasajeros
public class VehiculoPasajeros extends Vehiculo {
    private int numPasajeros;

    //constructor de la clase
    public VehiculoPasajeros(String marca, String modelo, int año, int numPasajeros) {
        super(marca, modelo, año);
        this.numPasajeros = numPasajeros;
    }
    //getters y setter para numPasajeros
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de pasajeros: " + numPasajeros);
    }
    //metodo para realizar mantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de vehículo de pasajeros...");
    }
}
