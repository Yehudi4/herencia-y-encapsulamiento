// Clase Auto
public class Auto extends VehiculoPasajeros {
    //constructor de la clase auto
    public Auto(String marca, String modelo, int año, int numPasajeros) {
        super(marca, modelo, año, numPasajeros);
    }
    //metodo para realizar mantenimiento especifico de un auto
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento específico de un auto...");
    }
    //Método para calcular el costo de mantenimiento de un auto
    public double calcularCostoMantenimiento(double costoPorKm, double kilometrosRecorridos) {
        return costoPorKm * kilometrosRecorridos;
    }
}