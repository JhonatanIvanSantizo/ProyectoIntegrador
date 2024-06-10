package tienda_barrio;

public class ProductoElectronico extends Producto implements Vendible{
    private int garantiaMeses;

    public ProductoElectronico(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto, int garantiaMeses) {
        super(nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String mostrarProductos() {
        return "Nombre: " + getNombre() + "\n" +
                "Descripción: " + getDescripcion() + "\n" +
                "Categoría: " + getCategoria() + "\n" +
                "Etiquetas: " + getEtiquetas() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "URL Foto: " + getUrlFoto() + "\n" +
                "Garantía (meses): " + garantiaMeses + "\n";
    }
    @Override
    public double calcularPrecioVenta(){
        return (getPrecio() * 120)/100;
    }
}
