// Clase base Vehiculo
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    //constructor de la clase
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

    // Método para realizar mantenimiento
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico del vehículo...");
    }
}