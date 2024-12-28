package Modelo;

/**
 *
 * @author marco
 */
public class Ventas {
    private int id;
    private String fecha;
    private double total;
    private int productosVendidos;

    public Ventas() {
    }

    public Ventas(int id, String fecha, double total, int productosVendidos) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.productosVendidos = productosVendidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    
}
