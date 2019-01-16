package hrs.indiv03;

/**
 *
 * @author Sergio
 */
//ATRIBUTOS
public class Usuario {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

//METODOS
    public Usuario() {
        nombre = "";
        apellidos = "";
        edad = -1;
        dni = "";
    }

//CONSTRUCTOR

    /**
     *
     * @param nombre
     * @param apellidos
     * @param edad
     * @param dni
     */
    public Usuario(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

//GET-SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
//TOSTRING
    @Override
    public String toString() {
        return nombre + " " + apellidos + ", Edad: " + edad + ", DNI: " + dni;
    }
}
