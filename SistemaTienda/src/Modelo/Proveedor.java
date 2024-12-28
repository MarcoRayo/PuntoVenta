package Modelo;

/**
 *
 * @author marco
 */
public class Proveedor {
    private int id;
    private String nombre;
    private String telefono;
    private String marca;

    public Proveedor() {
    }

    public Proveedor(int id, String nombre, String telefono, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
        
    
}
