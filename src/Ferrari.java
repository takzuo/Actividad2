// Definición de la clase Ferrari, que hereda de Automóvil
public class Ferrari extends Automovil {

    // Constructor
    public Ferrari(String color, int modelo) {
        super(color, modelo);
    }

    // Sobrescritura del método acelerar de Automóvil
    @Override
    public void acelerar() {
        System.out.println("El Ferrari aceleró mucho más rápido");
    }

}