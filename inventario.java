public class inventario {

        private productos producto[] = null;
        private double compra;

        // Constructores
        public inventario() {
        }

        public inventario(productos[] producto) {
            this.producto = producto;
        }

        // Metodos
        public productos[] cargarProductos() {

            return producto;
        }

        public void mostrarProductos(productos[] producto) {
            for (int i = 0; i < producto.length; i++) {
                System.out.print(producto[i]);
            }
        }

        public void nombreProduc(productos[] producto) {
            for (int i = 0; i < producto.length; i++) {
                System.out.println(i + 1 + " " + producto[i].getProducto() + "\n");
            }
        }

        public double compraProduc(productos[] producto, int num, int cantProduc) {
            if (producto[num - 1].enStock()) {
                if (producto[num - 1].getCantStock() >= cantProduc) {
                    System.out.println("El producto se agrego al carrito");
                    producto[num - 1].setCantStock(producto[num - 1]
                            .getCantStock() - cantProduc);
                    return compra += cantProduc
                            * producto[num - 1].getPrecio();
                } else {
                    System.out.println("Producto agotado");
                }
            }
            return compra;
        }

        public double totalCompra() {
            System.out.print("El total de la compra es ");
            compra = Math.round(compra * 100);
            return compra / 100;
        }
    }
