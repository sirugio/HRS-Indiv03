package hrs.indiv03;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Prueba {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        
        Usuario nuevo = new Usuario();
        System.out.print("Introduzca un nombre: ");
        Usuario.nombre = in.next(setNombre);
        nuevo.setNombre("Sergio");
        nuevo.setApellidos("Ruiz Herrera");
        nuevo.setEdad(33);
        nuevo.setDni("75164270V");

        System.out.println(nuevo.toString());
        
        /**
        

        System.out.print("Introduce tu nombre: ");
        Usuario.nombre = in.next();
        System.out.print("Introduce tus apellidos: ");
        Usuario.apellidos = in.next();
        System.out.print("Introduce tu edad: ");
        Usuario.edad = in.nextInt();
        System.out.print("Introduce tu DNI: ");
        Usuario.dni = in.next();

        System.out.println(toString());
        */
    }
}
