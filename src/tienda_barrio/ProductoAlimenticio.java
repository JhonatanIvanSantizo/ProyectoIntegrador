package tienda_barrio;

import java.io.Serializable;

public class ProductoAlimenticio extends Producto implements Vendible{
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto, String fechaCaducidad) {
        super(nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String mostrarProductos() {
        return "Nombre: " + getNombre() + "\n" +
                "Descripción: " + getDescripcion() + "\n" +
                "Categoría: " + getCategoria() + "\n" +
                "Etiquetas: " + getEtiquetas() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "URL Foto: " + getUrlFoto() + "\n" +
                "Fecha de Caducidad: " + fechaCaducidad + "\n";
    }
    @Override
    public double calcularPrecioVenta(){
        return (getPrecio() * 120)/100;
    }
}
