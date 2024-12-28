package Modelo;

/**
 *
 * @author marco
 */
public class Producto {
    private int id;
    private String nombre;
    private int peso;
    private double precio;
    private int cantidad;
    private long codigo;
    private int categoria;
    private int proveedor;
    private String letra;

    public Producto() {
    }

    public Producto(int id, String nombre, int peso, double precio, int cantidad, long codigo, int categoria, int proveedor, String letra) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.letra = letra;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}
