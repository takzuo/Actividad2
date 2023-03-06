// Definición de la clase Automóvil
public class Automovil {

    // Variables de instancia
    private String color;
    private int modelo;

    // Constructor
    public Automovil(String color, int modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    // Método para arrancar el automóvil
    public void arrancar() {
        System.out.println("El automóvil arrancó");
    }

    // Método para acelerar el automóvil
    public void acelerar() {
        System.out.println("El automóvil aceleró");
    }

    // Método para frenar el automóvil
    public void frenar() {
        System.out.println("El automóvil frenó");
    }

}