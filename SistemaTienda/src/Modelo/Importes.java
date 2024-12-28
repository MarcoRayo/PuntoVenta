package Modelo;

public class Importes {
    private int id;
    private String nombre;
    private String fecha;
    private double costo;
    private String descripcion;

    public Importes() {
    }

    public Importes(int id, String nombre, String fecha, double costo, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.costo = costo;
        this.descripcion = descripcion;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }        
}
