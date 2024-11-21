/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author Nicolas
 */
public class Variables {

    private String nom;
    private String ape;
    private String correo;
    private String contraseña;
    private String direccion;
    private  int edad;
    private String genero;
    private String producto;
    private String formaPago;

    public Variables() {
    }

    public Variables(String nom, String ape, String correo, String contraseña, String direccion, int edad, String genero, String producto, String formaPago) {
        this.nom = nom;
        this.ape = ape;
        this.correo = correo;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.edad = edad;
        this.genero = genero;
        this.producto = producto;
        this.formaPago = formaPago;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

   

    

    

}
