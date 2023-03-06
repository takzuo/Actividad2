// Clase principal para crear instancias de Automóvil y Ferrari
public class Main {

    public static void main(String[] args) {
        // Crear una instancia de Automóvil
        Automovil auto = new Automovil("rojo", 2022);
        // Usar los métodos de Automóvil
        auto.arrancar();
        auto.acelerar();
        auto.frenar();

        // Crear una instancia de Ferrari
        Ferrari ferrari = new Ferrari("amarillo", 2023);
        // Usar los métodos de Automóvil heredados por Ferrari
        ferrari.arrancar();
        ferrari.frenar();
        // Usar el método sobrescrito de Ferrari
        ferrari.acelerar();
    }

}