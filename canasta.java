import java.util.InputMismatchException;
import java.util.Scanner;
public class canasta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Finalizar = false;
        int op, op1, op2;

        productos prod1 = new productos("Arroz", 3.50, 10, true);
        productos prod2 = new productos("Huevos", 3.40, 10, true);
        productos prod3 = new productos("Harina", 1.20, 10, true);
        productos prod4 = new productos("Fideos", 2.10, 10, true);
        productos prod5 = new productos("Carne", 3.00, 10, true);
        productos prod6 = new productos("Pollo", 4.50, 10, true);
        productos prod7 = new productos("Gaceosa", 0.50, 10, true);

        productos registropro[] = new productos[productos.dimesionArray];
        inventario orden = new inventario();

        registropro[0] = prod1;
        registropro[1] = prod2;
        registropro[2] = prod3;
        registropro[3] = prod4;
        registropro[4] = prod5;
        registropro[5] = prod6;
        registropro[6] = prod7;

        while (!Finalizar) {
            System.out.println("\t           |Canasta de compras|\n");
            System.out.println("\t          PRODUCTOS DISPONIBLES\n");
            orden.mostrarProductos(registropro);
            System.out.println("\n1) Escoger productos");
            System.out.println("2) Ver el total hasta ahora");
            System.out.println("3) Finalizar la compra");

            try {
                System.out.print("Elija una opción: ");
                op = sc.nextInt();

                switch (op) {

                    case 1:

                        orden.nombreProduc(registropro);
                        System.out.print("¿Qué producto desea comprar?");
                        op1 = sc.nextInt();
                        System.out.print("¿Cuantos deasea comprar?");
                        op2 = sc.nextInt();
                        orden.compraProduc(registropro, op1, op2);

                        break;
                    case 2:
                        System.out.println(orden.totalCompra() + " $");
                        break;
                    case 3:
                        Finalizar = true;
                        System.out.println("Fue un gusto ayudarlo :)");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción invalida, por favor intentelo de nuevo");
                sc.next();
            }
        }
    }
}
