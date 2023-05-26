package com.nacho.clases;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase que representa un carrito de compra virtual
 * 
 * @author EPIKO
 * @version 1.0
 */
public class Carrito {
    private  List<Producto> carro;
    private int id;
    
    public Carrito(){
        id=(int)(Math.random()*1111111111+1);
        carro=new ArrayList<>();
    }
    public  Carrito( int id){
        this.id=id;
        carro=new ArrayList<>();
    }
    /**
     * Calcula el total del precio de los productos de nuestro carro
     * @return devuelve un numero decimal que representa la media de precios en el carro
     */
    public double calcularTotal(){
        double total=0;
        for (Producto producto : carro) {
           total+= producto.getPrecio();
        }
       
        return total;
    }
    /**
     * Calcula el precio medio del producto en el carrito
     * @return devuelve un numero decimal que representa la media de precios en el carro
     */
    public double precioMedio(){
        return calcularTotal()/carro.size();
    }
    /**
     * Aniade un producto a nuestro carro pasado por parametro
     * @param p producto a aniadir a nuestro carro
     */
    public void addProducto(Producto p){
        carro.add(p);
    }
    /**
     Borra un producto de nuestro carro pasado por parametro
     * @param p producto a borrar de nuestro carro
     */
    public void delProducto(Producto p){
        while (carro.contains(p)) {            
            carro.remove(p);
        }
    }
    /**
     * Nos devuelve el carrito para poder trabajar fuera de la clase
     * @return Devuelve la estructura de carro
     */
    public List<Producto> getCarro() {
        return carro;
    }
    /**
     * Nos permite sobreescribir un carro
     * @param carro el carro a introducir ya listo en carrito
     */
    public void setCarro(List<Producto> carro) {
        this.carro = carro;
    }
    /**
     * Nos permite trabajar con el id fuera de esta clase
     * @return Nos devuelve el id del carro
     */
    public int getId() {
        return id;
    }
    /**
     * Nos permite cambiar el id del carrito
     * @param id el id que queremos poner al carrito
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Repersentacion de la clase carrito
     * @return devuelve una cadena de texto que representa el carrito
     */
    @Override
    public String toString() {
        return "Carrito{" + "carro=" + carro + ", id=" + id + '}';
    }
    
}
