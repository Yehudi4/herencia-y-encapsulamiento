// Clase Camion
public class Camion extends VehiculoCarga {
    // Constructor de la clase Camion
    public Camion(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año, capacidadCarga);
    }
    // Método para realizar mantenimiento específico de un camión
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento específico de un camión...");
    }
     // Método para calcular el costo de mantenimiento de un camión
    public double calcularCostoMantenimiento(double costoPorKm, double kilometrosRecorridos) {
        return costoPorKm * kilometrosRecorridos;
    }
}