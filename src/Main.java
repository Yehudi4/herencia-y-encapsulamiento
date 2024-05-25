// Clase Principal
public class Main {
    public static void main(String[] args) {
         // Crear una instancia de Auto
        Auto miAuto = new Auto("Toyota", "Corolla", 2020, 5);
        // Crear una instancia de Camion
        Camion miCamion = new Camion("Volvo", "FH16", 2018, 20000);
        
        // Mostrar información y realizar mantenimiento del auto
        miAuto.mostrarInfo();
        miAuto.realizarMantenimiento();
        // Calcular y mostrar el costo de mantenimiento del auto
        double costoAuto = miAuto.calcularCostoMantenimiento(0.5, 10000);
        System.out.println("Costo del mantenimiento del auto: " + costoAuto);
      // Mostrar información y realizar mantenimiento del camión
        miCamion.mostrarInfo();
        miCamion.realizarMantenimiento();
         // Calcular y mostrar el costo de mantenimiento del camión
        double costoCamion = miCamion.calcularCostoMantenimiento(0.8, 15000);
        System.out.println("Costo del mantenimiento del camión: " + costoCamion);
    }
}