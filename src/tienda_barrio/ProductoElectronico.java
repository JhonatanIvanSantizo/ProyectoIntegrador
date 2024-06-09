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
    public void mostrarProductos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Etiquetas: " + String.join(", ", getEtiquetas()));
        System.out.println("Precio: " + getPrecio());
        System.out.println("URL Foto: " + getUrlFoto());
        System.out.println("Garantía (meses): " + garantiaMeses);
    }
    @Override
    public double calcularPrecioVenta(){
        return (getPrecio() * 120)/100;
    }
}
