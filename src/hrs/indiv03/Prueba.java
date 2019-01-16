package hrs.indiv03;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Prueba {

    public static final int MAX_PRODUCTOS = 20;
    public static final int MAX_USUARIOS = 20;

    public static void main(String[] agrs) {

        int opcion;
        Scanner scanner;
        String cadena;
        int entero;
        int nProductos;
        int nUsuarios;

        Producto p;
        Usuario u;
        Producto[] productos;
        Usuario[] usuarios;

        productos = new Producto[MAX_PRODUCTOS];

        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            productos[i] = new Producto();
        }

        nProductos = 0;
        usuarios = new Usuario[MAX_USUARIOS];

        for (int i = 0; i < MAX_USUARIOS; i++) {
            usuarios[i] = new Usuario();
        }

        nUsuarios = 0;

        scanner = new Scanner(System.in);

        p = new Producto();
        u = new Usuario();

        do {
            System.out.println("\n1. Mostrar productos.");
            System.out.println("2. Mostrar usuarios.");
            System.out.println("3. Insertar producto.");
            System.out.println("4. Insertar usuario.");
            System.out.println("5. Editar productos.");
            System.out.println("6. Editar usuarios.");
            System.out.println("7. Eliminar producto.");
            System.out.println("8. Eliminar usuario.");
            System.out.println("9. Salir.");
            System.out.print("Introduce opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (nProductos > 0) {
                        for (int i = 0; i < nProductos; i++) {
                            System.out.println(productos[i].toString());
                        }
                    } else {
                        System.out.println("No hay productos");
                    }
                    break;

                case 2:
                    if (nUsuarios > 0) {
                        for (int i = 0; i < nUsuarios; i++) {
                            System.out.println(usuarios[i].toString());
                        }
                    } else {
                        System.out.println("No hay usuarios");
                    }
                    break;

                case 3:
                    if (nProductos < MAX_PRODUCTOS) {
                        System.out.print("Introduce Referencia: ");
                        productos[nProductos].setReferencia(scanner.nextLine());
                        System.out.print("Introduce Nombre: ");
                        productos[nProductos].setNombre(scanner.nextLine());
                        System.out.print("Introduce Uniudades: ");
                        productos[nProductos].setUnidades(scanner.nextInt());
                        nProductos++;
                        System.out.println("Producto insertado con éxito.");
                    } else {
                        System.out.println("Ya no entran mas productos");
                    }
                    break;

                case 4:
                    if (nUsuarios < MAX_USUARIOS) {
                        System.out.print("Introduce Nombre: ");
                        usuarios[nUsuarios].setNombre(scanner.nextLine());
                        System.out.print("Introduce Apellidos: ");
                        usuarios[nUsuarios].setApellidos(scanner.nextLine());
                        System.out.print("Introduce DNI: ");
                        usuarios[nUsuarios].setDni(scanner.nextLine());
                        System.out.print("Introduce Edad: ");
                        usuarios[nUsuarios].setEdad(scanner.nextInt());
                        nUsuarios++;
                        System.out.println("Usuario insertado con éxito.");
                    } else {
                        System.out.println("Ya no entran mas usuarios");
                    }
                    break;

                case 5:
                    System.out.print("Introduce referencia: ");
                    cadena = scanner.nextLine();

                    int i = 0;

                    while ((i < nProductos) && (!productos[i].getReferencia().equals(cadena))) {
                        i++;
                    }

                    if (i == nProductos) {
                        System.out.println("No se ha encontrado la referencia " + cadena);
                    } else {
                        System.out.print("Nuevo Nombre: ");
                        productos[i].setNombre(scanner.nextLine());
                        System.out.print("Nuevas Unidades: ");
                        productos[i].setUnidades(scanner.nextInt());
                        System.out.println("Producto modificado con éxito.");

                    }
                    break;

                case 6:
                    System.out.print("Introduce Dni: ");
                    cadena = scanner.nextLine();

                    i = 0;

                    while ((i < nUsuarios) && (!usuarios[i].getDni().equals(cadena))) {
                        i++;
                    }

                    if (i == nUsuarios) {
                        System.out.println("No se ha encontrado el DNI " + cadena);
                    } else {
                        System.out.print("Nuevo Nombre: ");
                        usuarios[nUsuarios].setNombre(scanner.nextLine());
                        System.out.print("Nuevo Apellidos: ");
                        usuarios[nUsuarios].setNombre(scanner.nextLine());
                        System.out.print("Nuevo DNI: ");
                        usuarios[nUsuarios].setDni(scanner.nextLine());
                        System.out.print("Nueva Edad: ");
                        usuarios[nUsuarios].setEdad(scanner.nextInt());
                        System.out.println("Usuario modificado con éxito.");

                    }
                    break;

                case 7:
                    System.out.print("Introduce referencia: ");
                    cadena = scanner.nextLine();

                    i = 0;

                    while ((i < nProductos) && (!productos[i].getReferencia().equals(cadena))) {
                        i++;
                    }

                    if (i == nProductos) {
                        System.out.println("No se ha encontrado la referencia " + cadena);
                    } else {
                        for (int j = i; j < nProductos - 1; j++) {
                            productos[j] = productos[j + 1];
                        }

                        nProductos--;
                        System.out.println("Producto eliminado con éxito.");
                    }
                    break;

                case 8:
                    System.out.print("Introduce Dni: ");
                    cadena = scanner.nextLine();

                    i = 0;

                    while ((i < nUsuarios) && (!usuarios[i].getDni().equals(cadena))) {
                        i++;
                    }

                    if (i == nUsuarios) {
                        System.out.println("No se ha encontrado el DNI " + cadena);
                    } else {
                        for (int j = i; j < nUsuarios - 1; j++) {
                            usuarios[j] = usuarios[j + 1];
                        }

                        nUsuarios--;
                        System.out.println("Usuario elimninado con éxito.");
                    }
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 9);

    }

}
