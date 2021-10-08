/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.prueba.entidades;

/**
 * @author Vicente Espinosa
 */
public class Mascota {
    /**
     * @param nombre de mascota
     * @param edad de mascota
     * @param peso de mascota
     * @param tipo de mascota (Go P) de mascota
     */
    
    private String  nombre;
    private int     edad;
    private int     peso;
    private String  tipoMascota;
    private Dueno  dueno;

    public Mascota(String name, int edad, int peso, String tipoMascota) {
        this.nombre = name;
        this.edad = edad;
        this.peso = peso;
        this.tipoMascota = tipoMascota;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }
    // Con este custom method se imprime los datos de la mascota
    public void imprimirInfoMAscota() {
        System.out.println("--------------Paciente--------------");
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getEdad());
        System.out.println("Peso: " + getPeso());
        System.out.println("Tipo mascota: " + getTipoMascota());
        System.out.println("Nombre dueño: " + getDueno().getNombre());
        System.out.println("Telefono dueño: " + getDueno().getTelefono());
    }
    // Con este custom method se retorna el valor total de la esterilizacion
    public long costoEstelizacion() {
        if (getTipoMascota().equals("G")) {
            return Math.round(65000 * 0.7);
        }
        return 65000;
    }
} 
