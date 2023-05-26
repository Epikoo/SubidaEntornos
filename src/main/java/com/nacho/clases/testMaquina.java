package com.nacho.clases;

public class testMaquina {

    public static void main(String[] args) {
        Usuario u1=new Usuario(1, true, "NAcho", 999999999);
        Carrito c1=new Carrito(12313);
        for (int i = 0; i < 10; i++) {
            Producto p=new Producto();
            c1.addProducto(p);
        }
        u1.nuevaFactura(c1);
        System.out.println("El total del carrito es de " + c1.calcularTotal() + " €");
        System.out.println("La media de precios del carrito es de " + c1.precioMedio() + " €");
        u1.darseDeBaja();
        u1.darseDeAlta();
    }

}
