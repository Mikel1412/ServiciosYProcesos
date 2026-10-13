package EjerciciosRA1.Ejercicio4;

public class Pruebas {
    static void main() {
        String so = System.getProperty("os.name");
        String[] sistema;
        sistema=so.split(" ");
        System.out.println(so);

        sistema = System.getProperty("os.name").split(" ");
        System.out.println(sistema[0]);
    }
}
