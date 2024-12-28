package Modelo;

/**
 *
 * @author marco
 */
public class Categoria {  
    private int Id;
    private String nombre;

    public Categoria() {
    }

    public Categoria(int Id, String nombre) {
        this.Id = Id;
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }               
}
