package com.nacho.clases;

import java.util.ArrayList;
import java.util.List;


/**
 *  Clase que representa un cliente de nuestro restaurante
 * @author EPIKO
 * @version 1.0
 */
public class Usuario {
    private int id;
    private boolean socio;
    private String nombre;
    private  long tlf;
    private List<Carrito> facturas;

    public Usuario(){
        id=0;
        socio=false;
        nombre="";
        tlf=0;
        facturas=new ArrayList<>();
    }    
    
    public Usuario(int id, boolean socio, String nombre, long tlf) {
        this.id = id;
        this.socio = socio;
        this.nombre = nombre;
        this.tlf = tlf;
        facturas=new ArrayList<>();
    }
    /**
     * Metodo que nos permite inscribir un user como socio
     */
    public boolean darseDeAlta(){
        socio=true;
        System.out.println("El usuario se ha dado de alta como socio");
        return true;
    }
    /**
     * Metodo que nos permite borrar un user como socio
     */
    public boolean darseDeBaja(){
        socio=false;
         System.out.println("El usuario "  + nombre + " se ha dado de baja");
         return false;
    }
    
    /**
     * Nos permite aniadir un pedido a nuestro histrorial de facturas
     * @param c carrito que aniadiremos en factura
     */
    public void nuevaFactura(Carrito c){
        facturas.add(c);
        System.out.println("Factura almacenada con exito");
    }
    /**
     * Permite usar el id fuera de la clase
     * @return devuelve el id del usuario
     */
    public int getId() {
        return id;
    }
    /**
     * nos permite cambiar el id del user
     * @param id id a insertar al usuario
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Nos permite saber si es socio o no
     * @return devuelve true si el user es socio, false en caso contrario
     */
    public boolean isSocio() {
        return socio;
    }
    /**
     * Nos permite variar desde fuera de la clase el estado de socio
     * @param socio estado de socio que queremos sobreescribir en el user
     */

    public void setSocio(boolean socio) {
        this.socio = socio;
    }
    /**
     * Nos permite usar el nombre del user fuera de la clase
     * @return nos devuelve el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Nos permite sobreescribir el nombre del user
     * @param nombre nombre que queremos indexar al user
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Permite usar el telefono fuera de esta clase
     * @return nos devuelve el num de telefono del user
     */
    public long getTlf() {
        return tlf;
    }
    /**
     * Permite sobreescribir el telefono del user
     * @param tlf Telefono que queremos indexar al usuario
     */
    public void setTlf(long tlf) {
        this.tlf = tlf;
    }
    /**
     * Permite usar la lista de facturas fuera de la clase
     * @return devuelve la listas de facuras del user
     */
    public List<Carrito> getFacturas() {
        return facturas;
    }
    /**
     * Permite sobreescribir la lista de facturas en el user
     * @param facturas listado que sustituira las facturas actuales del user
     */
    public void setFacturas(List<Carrito> facturas) {
        this.facturas = facturas;
    }
    /**
     * Representacion en cadena de un usuario
     * @return devuelve una cadena de texto que representa a un usuario
     */
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", socio=" + socio + ", nombre=" + nombre + ", tlf=" + tlf + ", facturas=" + facturas + '}';
    }
    
    
}
