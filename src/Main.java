import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean visitante, empleado, estudiante;
        byte edad;
        int altura, apartamento, peso, cantidad;
        long telefono;
        String nombre, apellido;
        char genero;

        //Se ingresa en teclado
        System.out.println("Bienvenido al Edificio SkyTower");

        System.out.println("\nEl visitante es un Empleado? (true/false): ");
        empleado = scanner.nextBoolean();

        System.out.println("\nEs estudiante? (true/false): ");
        estudiante = scanner.nextBoolean();

        System.out.println("\nEs un visitante nuevo? (true/false): ");
        visitante = scanner.nextBoolean();

        System.out.println("\nNombre: ");
        nombre = scanner.next();

        System.out.println("\nApellido: ");
        apellido = scanner.next();

        System.out.println("\nEdad: ");
        edad = scanner.nextByte();

        System.out.println("\nGenero (M/F): ");
        genero = scanner.next().charAt(0);

        System.out.println("\nPeso del visitante (En Kg): ");
        peso = scanner.nextShort();

        System.out.println("\nAltura del visitante (cm): ");
        altura = scanner.nextInt();

        System.out.println("\nNumero de telefono: ");
        telefono = scanner.nextLong();

        System.out.println("\nNumero de apartamento: ");
        apartamento = scanner.nextInt();

        System.out.println("\nCantidad de visitantes: ");
        cantidad = scanner.nextInt();


        //Se imprime en pantalla
        System.out.println("El visitante es un Empleado: " + empleado);
        System.out.println("\nEl visitante es un Estudiante: " + estudiante);
        System.out.println("\nEs un visitante nuevo: " + visitante);
        System.out.println("\nNombre: " + nombre + " " + apellido);
        System.out.println("\nEdad: " + edad);
        System.out.println("\nGenero: " + genero);
        System.out.println("\nPeso del visitante: " + peso);
        System.out.println("\nAltura del visitante: " + altura);
        System.out.println("\nNumero de telefono: " + telefono);
        System.out.println("\nNumero de apartamento: " + apartamento);
        System.out.println("\nCantidad de visitante: " + cantidad);

    }
}