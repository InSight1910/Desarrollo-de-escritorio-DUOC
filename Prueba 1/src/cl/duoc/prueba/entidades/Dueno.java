/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.prueba.entidades;

/**
 *
 * @author Vicente Espinosa
 */
public class Dueno {

    /**
     * @param nombre dueño
     * @param apellido dueño
     * @param telefono de contacto dueño
     * @param email dueño
     * @param rut dueño
     */
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String rut;

    public Dueno(String nombre, String apellido, String telefono, String email, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

}
