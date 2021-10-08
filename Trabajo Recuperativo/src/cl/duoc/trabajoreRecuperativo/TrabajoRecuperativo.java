/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.trabajoreRecuperativo;

import java.util.Scanner;
import cl.duoc.trabajoreRecuperativo.entidades.*;
import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author Vicente Espinosa
 */
public class TrabajoRecuperativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Validacion validacion = new Validacion();
        // Instacias de objetos
        Venta venta = null;
        Libro libro = null;

        int opcion;
        boolean flag = false;

        // Atributos libro
        String isbn;
        String titulo;
        String categoria;
        int precio = 0;
        int cantidadPaginas = 0;
        String autor;
        String editorial;
        int anno;
        Date fechaPublicacion = null;

        // Atributos venta
        String codigoVenta;
        int cantidad = 0;

        do {
            System.out.println("-----------------------Menu-----------------------");
            System.out.println("1 Crear un libro");
            System.out.println("2 Crear una venta");
            System.out.println("3 Asociar a un pedido");
            System.out.println("4 Informacion sobre el pedido");
            System.out.println("5 Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingresa el ISBN del libro");
                        isbn = sc.next();
                        flag = validacion.validarISBN(isbn);
                        if (!flag) {
                            System.out.println("El codigo ISBN debe tener un largo de 13 caracteres");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa el titulo del libro");
                        titulo = sc.next();
                        flag = validacion.validarStringValida(titulo);
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa la categoria del libro");
                        categoria = sc.next();
                        categoria = validacion.toCapitalize(categoria);

                        flag = validacion.validarCategoria(categoria);
                        if (!flag) {
                            System.out.println("La categoria debe ser (Especialidad, Terror, Fantasia o Ficcion)");
                        }
                    } while (flag == false);
                    do {
                        try {
                            System.out.println("Ingresa el precio del libro");
                            precio = sc.nextInt();
                            flag = validacion.validarNumeroPositivo(precio);
                            if (!flag) {
                                System.out.println("El precio debe ser positivo");
                            }
                        } catch (InputMismatchException err) {
                            System.out.println("Los caracteres no son permitidos");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa la cantidad de paginas del libro");
                        try {
                            cantidadPaginas = sc.nextInt();
                            flag = validacion.validarNumeroPositivo(cantidadPaginas);
                            if (!flag) {
                                System.out.println("La cantidad de paginas debe ser positivo");
                            }
                        } catch (InputMismatchException err) {
                            System.out.println("Los caracteres no son permitidos");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa el autor del libro");
                        autor = sc.next();
                        flag = validacion.validarStringValida(autor);
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa la editorial del libro");
                        editorial = sc.next();
                        flag = validacion.validarStringValida(editorial);
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa el anno de publicacion del libro");
                        anno = sc.nextInt();
                        flag = validacion.validarFecha(anno);
                        if (!flag) {
                            System.out.println("El año debe ser entre el 2000 y el 2021");
                        }
                    } while (flag == false);
                    libro = new Libro(validacion.separadorISBN(isbn), titulo, categoria, precio, cantidadPaginas, autor, editorial, anno);
                    break;
                case 2:
                    do {
                        System.out.println("Ingresa el codigo de la venta");
                        codigoVenta = sc.next();
                        flag = validacion.validarStringValida(codigoVenta);
                    } while (flag == false);
                    do {
                        try {
                            System.out.println("Ingresa cuantos libros son");
                            cantidad = sc.nextInt();
                            flag = validacion.validarNumeroPositivo(cantidad);
                        } catch (InputMismatchException err) {
                            System.out.println("Los caracteres no son permitidos");
                        }
                    } while (flag == false);
                    venta = new Venta(codigoVenta, cantidad);
                    break;
                case 3:
                    System.out.println("Producto asociado");
                    venta.setLibro(libro);
                    venta.calcularTotal();
                    System.out.println("Asociado exitosamente");
                    break;
                case 4:
                    System.out.println(venta.toString());
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }

}
