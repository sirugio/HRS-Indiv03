package hrs.indiv03;

public class Usuarios {
    public static final int CAPACIDAD = 10;
    private Usuario[] usuarios;
    private int tamanno;
    
    public Usuarios() {
        usuarios = new Usuario[CAPACIDAD];
        tamanno = 0;
    }
    
    public int posicionUsuario(String dni) {
        int posicion = -1;
        int i = 0;
        
        while ((i < tamanno) && (posicion == -1)) {
            if (usuarios[i].getDni().equals(dni)) {
                posicion = i;
            }
            
            i++;
        }
        
        return posicion;
    }
    
    public void insertaUsuario(String nombre, String apellidos, int edad, String dni) {
        Usuario usuario = new Usuario(nombre, apellidos, edad, dni);
        
        if (tamanno < CAPACIDAD) {
            if (posicionUsuario(dni) == -1) {
                usuarios[tamanno] = usuario;
                tamanno++;
                System.out.println("Usuario insertado");
            } else {
                System.out.println("El DNI ya existe");
            }
        } else {
            System.out.println("Ya no entran mas usuarios");
        }
    }
    
    public void muestraUsuario(String dni) {
        int posicion = posicionUsuario(dni);
        
        if (posicion != -1) {
            Usuario usuario = usuarios[posicion];
            System.out.println(usuario.toString());
        } else {
            System.out.println("No existe el DNI");
        }
    }
    
    public void modificaUsuario(String nombre, String apellidos, int edad, String dni) {
        int posicion = posicionUsuario(dni);
        
        if (posicion != -1) {
            usuarios[posicion].setNombre(nombre);
            usuarios[posicion].setApellidos(apellidos);
            usuarios[posicion].setEdad(edad);
            System.out.println("Usuario modificado");
        } else {
            System.out.println("No existe el DNI");
        }
    }
    
    public void borraUsuario(String dni) {
        int posicion = posicionUsuario(dni);
        
        if (posicion != -1) {
            for (int i = posicion; i < tamanno - 1; i++) {
                usuarios[posicion] = usuarios[posicion + 1];
            }
            
            tamanno--;
            
            System.out.println("Usuario borrado");
        } else {
            System.out.println("No existe el DNI");
        }
    }
}
