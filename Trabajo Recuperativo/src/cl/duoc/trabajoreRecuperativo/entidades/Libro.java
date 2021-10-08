/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.trabajoreRecuperativo.entidades;

import java.util.Date;

/**
 *
 * @author cvveg
 */
public class Libro {
    private String  isbn;
    private String  titulo;
    private String  categoria;
    private int     precio;
    private int     cantidadPaginas;
    private String  autor;
    private String  editorial;
    private int    annoPublicacion;

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", categoria=" + categoria + ", precio=" + precio + ", cantidadPaginas=" + cantidadPaginas + ", autor=" + autor + ", editorial=" + editorial + ", annoPublicacion=" + annoPublicacion + '}';
    }

    public Libro(String isbn, String titulo, String categoria, int precio, int cantidadPaginas, String autor, String editorial, int annoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.editorial = editorial;
        this.annoPublicacion = annoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }
    
}
