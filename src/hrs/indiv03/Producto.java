package hrs.indiv03;

/**
 *
 * @author Sergio
 */
public class Producto {

    private String referencia;
    private String nombre;
    private int unidades;

    /**
     * public Producto() { referencia = ""; nombre = ""; unidades = -1;
     *
     * @param referencia
     * @param nombre
     * @param unidades
     */
    //constructor
    public Producto(String referencia, String nombre, int unidades) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.unidades = unidades;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Referencia: " + referencia + " Nombre: " + nombre + " Unidades: " + unidades;
    }
}
