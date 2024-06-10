import exception.*;
import tienda_barrio.*;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductoAlimenticio producto1 = new ProductoAlimenticio("Leche entera","Bolsa x 1.100ml","Lacteos","Leche",31.00,"https://www3.gobiernodecanarias.org/medusa/mediateca/ecoescuela/wp-content/uploads/sites/2/2013/11/14-Leche.png","2024-06-09");
        ProductoElectronico producto2 = new ProductoElectronico("Computadora de escritorio","8GB de Ram, i7","Equipo de computo","PC",5999.99,"https://intelite.gt/wp-content/uploads/2021/03/Sin-titulo-1.jpg",36);

        AdministradorArchivos adminArchivos = new AdministradorArchivos();

        StringBuilder detalles = new StringBuilder();
        detalles.append("Producto alimenticio:\n");
        detalles.append(producto1.mostrarProductos());
        detalles.append("Precio de venta: ").append(producto1.calcularPrecioVenta()).append("\n\n");
        detalles.append("Producto electronico:\n");
        detalles.append(producto2.mostrarProductos());
        detalles.append("Precio de venta: ").append(producto2.calcularPrecioVenta()).append("\n");

        try {
            adminArchivos.escribirArchivo("archivo.txt", detalles.toString());
        } catch (GuardarDatosException e) {
            System.out.println(e.getMessage());
        }

        try {
            String contenidoArchivo = adminArchivos.leerArchivo("archivo.txt");
            System.out.println(contenidoArchivo);
        } catch (CargaDatosException e) {
            System.out.println(e.getMessage());
        }
    }
}