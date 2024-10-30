package Ejercicio11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Almacen {
    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el almacén.");
            return;
        }
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void listarProductosEnPeligro() {
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto instanceof CarneFresca) {
                CarneFresca carne = (CarneFresca) producto;
                if (carne.getDiasCaducidad() < 10) {
                    System.out.println(carne);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No hay carnes frescas en peligro.");
        }
    }

    public double calcularPrecioMedio() {
        if (productos.isEmpty()) return 0;

        double totalPrecio = 0;
        for (Producto producto : productos) {
            totalPrecio += producto.calcularPrecio();
        }
        return totalPrecio / productos.size();
    }

    public void eliminarBandejas() {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto instanceof CarneCongeladaEntera) {
                CarneCongeladaEntera carne = (CarneCongeladaEntera) producto;
                if (carne.isEnBandeja()) {
                    iterator.remove();
                }
            }
        }
    }
}
