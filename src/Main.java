import tienda_barrio.Producto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Leche entera","Bolsa x 1.100ml","Lacteos","Leche",31.00,"https://www3.gobiernodecanarias.org/medusa/mediateca/ecoescuela/wp-content/uploads/sites/2/2013/11/14-Leche.png");
        Producto producto2 = new Producto("Leche deslactosada","Bolsa x 1.100ml","Lacteos","Leche",34.00,"https://walmartgt.vtexassets.com/arquivos/ids/452436/Leche-Foremost-Uht-Deslactosada-y-Semidescremada-946ml-1-58224.jpg?v=638416332253970000");
        Producto producto3 = new Producto("Leche semi-descremada","Bolsa x 1.100ml","Lacteos","Leche",35.00,"https://walmartgt.vtexassets.com/arquivos/ids/454639/Leche-Sabemas-Uht-Semidescremada-1000ml-1-33966.jpg?v=638416436981870000");
        Producto producto4 = new Producto("Leche deslactosada-descremada","Bolsa x 1.100ml","Lacteos","Leche",35.00,"https://lala.com.gt/wp-content/uploads/2019/03/Lala-Deslactosada.png");
        Producto producto5 = new Producto("Leche descremada","Bolsa x 1.100ml","Lacteos","Leche",35.00,"https://www.conaprole.uy/wp-content/uploads/2019/09/leche-descremada.png");
        producto1.mostrarProductos();
        System.out.println("");
        producto2.mostrarProductos();
        System.out.println("");
        producto3.mostrarProductos();
        System.out.println("");
        producto4.mostrarProductos();
        System.out.println("");
        producto5.mostrarProductos();
    }
}