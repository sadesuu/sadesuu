

public class producto {

    private int codigo;
    private String nombre;
    private double precio;
    private categoria.categorias categoria;
    private int stock;


    public producto(int codigo, String nombre, double precio, categoria.categorias categoria, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public categoria.categorias getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void valorActual(String nombre){
        System.out.println(getPrecio());
    }
}
