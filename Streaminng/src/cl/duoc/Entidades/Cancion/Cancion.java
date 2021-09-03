/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.Entidades.Cancion;
import java.io.*;
/**
 *
 * @author Vicente Espinosa
 */
public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;
    private boolean favorito;
    private boolean descargada;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, int duracion, boolean favorito, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorito = favorito;
        this.descargada = descargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    
    public void advanceTime(int actualTime, int seconds) {
        int newTime = actualTime + seconds;
        if((actualTime > getDuracion()) || (newTime > getDuracion())) {
            System.out.println("No se puede hacer la operacion");
        } else {
            System.out.println((String)("Duracion: " +(int)(newTime / 60)) + ":" + (int)(newTime % 60));
        }
    }
    public void printSong() {
        int minutes = (int)(getDuracion() / 60);
        int seconds = (int)(getDuracion()%60);
        
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println((String)("Duracion: " + minutes + ":" + seconds));
    }
    public void compareSong() {
        if (getDuracion() >= 300) {
            System.out.println("Cancion larga");
        } else {
            System.out.println("Cancion corta");
        }
    }
}
