package com.nacho.clases;

/**
 *Clase que respresenta un producto de nuestro negocio
 *
 * @author EPIKO
 * @version 1.0
 *
 */
public class Producto {

    private int id;
    private String nombre;
    private String fechacad;
    private double precio;

    /**
     * Constructor vacio
     */
    public Producto() {
        id = (int) (Math.random() * 1000 + 1);
        nombre = "";
        fechacad = "31/12/2023";
        precio = 12.99;
    }

    /**
     *
     * @param id identificador del producto
     * @param nombre nombre de nuestro producto
     * @param fechacad fecha en la que el alimento se hara perecedero
     * @param precio coste total del producto
     */
    public Producto(int id, String nombre, String fechacad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.fechacad = fechacad;
        this.precio = precio;
    }

    /**
     *
     * @return devuelve el id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id escribe en el producto el id pasado por parametro
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return devuelve el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre sobreescribe el nombre del parametro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return devuelve la fecha de caducidad
     */
    public String getFechacad() {
        return fechacad;
    }
    /**
     * 
     * @param fechacad setea de nuevo la fecha de caducidad
     */
    public void setFechacad(String fechacad) {
        this.fechacad = fechacad;
    }
    /**
     * 
     * @return devuelve el precio del producto
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * 
     * @param precio guarda el precio en el producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * 
     * @return devuelve la representacion en cadena de producto
     */
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", fechacad=" + fechacad + ", precio=" + precio + '}';
    }

}
