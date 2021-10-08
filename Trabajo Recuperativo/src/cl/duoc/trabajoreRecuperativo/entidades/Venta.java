/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.trabajoreRecuperativo.entidades;

import java.util.Date;

/**
 *
 * @author Vicente Espinosa
 */
public class Venta {

    private String codigo;
    private int cantidad;
    private double impuesto = 1.19;
    private double descuento;
    private double total;
    private long fechaVenta = new Date().getTime();
    private Libro libro;

    public Venta(String codigo, int cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public long getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(long fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double verificarDescuento() {
        if (libro.getCategoria().equals("Especialidad")) {
            return 0.9;
        } else if (libro.getCategoria().equals("Terror")) {
            return 0.8;
        } else if (libro.getCategoria().equals("Fantasia")) {
            return 0.75;
        }
        return 1;
    }

    public void calcularTotal() {
        this.total = libro.getPrecio() * this.cantidad * verificarDescuento() * this.impuesto;
    }

    @Override
    public String toString() {
        return "Venta{" + "codigo=" + codigo  + ", cantidad=" + cantidad + ", impuesto=" + impuesto + ", total=" + total + ", fechaVenta=" + fechaVenta + ",\n libro=" + libro + '}';
    }

}
