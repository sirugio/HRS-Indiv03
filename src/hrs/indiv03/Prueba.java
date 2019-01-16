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
            System.out.println("\n1. Mostrar usuarios");
            System.out.println("2. Mostrar productos");
            System.out.println("3. insertar producto");
            System.out.println("4. insertar usuario");
            System.out.println("5. editar productos");
            System.out.println("6. editar usuarios");
            System.out.println("7. eliminar producto");
            System.out.println("8. eliminar usuario");
            System.out.println("9. Salir");
            System.out.print("Introduce opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (nUsuarios > 0) {
                        for (int i = 0; i < nUsuarios; i++) {
                            System.out.println(usuarios[i].toString());
                        }
                    } else {
                        System.out.println("No hay usuarios");
                    }
                    break;

                case 2:
                    if (nProductos > 0) {
                        for (int i = 0; i < nProductos; i++) {
                            System.out.println(productos[i].toString());
                        }
                    } else {
                        System.out.println("No hay productos");
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
                    }
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 9);

        /*Scanner in = new Scanner(System.in);

        int leidos = 0, totalALeer = 5;
        int numero;
        
        while (leidos < totalALeer) {
            System.out.println("Introduciendo número " + (leidos + 1) + "º: ");
            numero = sc.nextInt();
            intentosLectura++;
            if (numero >= 0) {
                leidos++;
                sumaTotal += numero;
            } else {
                System.out.println("El número " + numero + " es negativo, y se descarta.");
            }
        }*/
        /**
         *
         * Usuario nuevo = new Usuario(); System.out.print("Introduzca un
         * nombre: "); Usuario.nombre = in.next(setNombre);
         * nuevo.setNombre("Sergio"); nuevo.setApellidos("Ruiz Herrera");
         * nuevo.setEdad(33); nuevo.setDni("75164270V");
         *
         * System.out.println(nuevo.toString());
         *
         * /**
         *
         *
         * System.out.print("Introduce tu nombre: "); Usuario.nombre =
         * in.next(); System.out.print("Introduce tus apellidos: ");
         * Usuario.apellidos = in.next(); System.out.print("Introduce tu edad:
         * "); Usuario.edad = in.nextInt(); System.out.print("Introduce tu DNI:
         * "); Usuario.dni = in.next();
         *
         * System.out.println(toString());
         */
    }

}
