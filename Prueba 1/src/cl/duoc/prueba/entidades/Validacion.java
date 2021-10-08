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
public class Validacion {

    public Validacion() {
    }
    // Se valida que el telefono tenga una longitud de 9 caracteres
    public boolean validarTelefono(String telefono) {
        return telefono.length() == 9;
    }
    // Se valida que el tipo de mascota ingresado sea G o P
    public boolean validarTipoMascota(String tipoMascota) {
        return tipoMascota.equals("G") || tipoMascota.equals("P");
    }
    // Se valida que el peso de la mascota no sea mayor que50 y menor que 0
    public boolean validarPesoMascota(int peso) {
        return peso > 0 && peso <= 50;
    }
    // Se valida que el campo no este ni vacio ni nulo
    public boolean validarCamposObligatorios(String campo) {
        return campo == null || campo.equals("");
    }
    // Se valida que la edad sea mayor que 0
    public boolean validarEdad(int edad) {
        return edad > 0;
    }
}
