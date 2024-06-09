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
    public void mostrarProductos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Etiquetas: " + String.join(", ", getEtiquetas()));
        System.out.println("Precio: " + getPrecio());
        System.out.println("URL Foto: " + getUrlFoto());
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
    }
    @Override
    public double calcularPrecioVenta(){
        return (getPrecio() * 120)/100;
    }
}
