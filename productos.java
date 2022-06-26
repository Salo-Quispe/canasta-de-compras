import java.util.Scanner;
public class productos {

    private double precio;
    private String producto;

    private int cantStock;

    private boolean disponible = false;

    public static int dimesionArray;

    public productos(String producto, double precio, int cantStock, boolean disponible) {

        this.precio = precio;
        this.producto = producto;
        this.cantStock=cantStock;
        this.disponible=disponible;

        dimesionArray++;
    }

    //Getters y Setters
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantStock() {
        return this.cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    //Metodos

    public boolean enStock() {
        if (getCantStock() > 0)
            this.disponible = true;
        return this.disponible;
    }

    public void enStock(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public String toString() {
        return "Producto: " + this.getProducto() + " - " + "Precio: " + this.getPrecio() + " $ - " + "En Stock: " + this.getCantStock()+ "\n";
    }
}
