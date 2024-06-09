import tienda_barrio.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductoAlimenticio producto1 = new ProductoAlimenticio("Leche entera","Bolsa x 1.100ml","Lacteos","Leche",31.00,"https://www3.gobiernodecanarias.org/medusa/mediateca/ecoescuela/wp-content/uploads/sites/2/2013/11/14-Leche.png","2024-06-09");
        ProductoElectronico producto2 = new ProductoElectronico("Computadora de escritorio","8GB de Ram, i7","Equipo de computo","PC",5999.99,"https://intelite.gt/wp-content/uploads/2021/03/Sin-titulo-1.jpg",36);
        System.out.println("Producto alimenticio");
        producto1.mostrarProductos();
        System.out.println("Precio de venta: " + producto1.calcularPrecioVenta());
        System.out.println("");
        System.out.println("Producto electronico");
        producto2.mostrarProductos();
        System.out.println("Precio de venta: " + producto2.calcularPrecioVenta());
    }
}