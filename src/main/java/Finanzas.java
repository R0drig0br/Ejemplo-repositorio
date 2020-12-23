
import java.util.ArrayList;
import java.util.Scanner;

public class Finanzas {

    public Finanzas() {

    }

    public void ingresarTrabajadores() {

        Scanner texto = new Scanner(System.in);

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese cantidad de empleados");

        int cantidad;

        Empleado trabajadores[] = null;

        do {

            cantidad = numero.nextInt();
            System.out.println("**********************************************");
            try {

                trabajadores = new Empleado[cantidad];
            } catch (NegativeArraySizeException e) {
                System.out.println("cantidad de empleados invalida");
                System.out.println("Ingrese otra cantidad");

            }

        } while (cantidad < 0);

        System.out.println("**********************************************");
        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese Nombre trabajador N° " + i + 1);
            String nombre = texto.nextLine();

            System.out.println("Ingrese el Sueldo");

            int sueldo = numero.nextInt();

            trabajadores[i] = new Empleado(sueldo, nombre);
            System.out.println("**********************************************");

        }

    }

}
