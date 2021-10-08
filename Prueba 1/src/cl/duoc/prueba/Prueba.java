/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.prueba;

import cl.duoc.prueba.entidades.*;
import java.util.Scanner;

/**
 *
 * @author Vicente Espinosa
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Instancia entidades
        Validacion validacion = new Validacion();
        Mascota mc = null;
        Dueno dn = null;

        // Datos mascota
        String nombreMascota;
        int edadMascota;
        int pesoMascota;
        String tipoMascota;

        // Datos dueno
        String nombreDueno;
        String apellidoDueno;
        String telefonoDueno;
        String emailDueno;
        String rutDueno;

        boolean flag = false;
        do {
            System.out.println("---------------------Menu---------------------");
            System.out.println("1 Crear un registro de paciente (mascota)");
            System.out.println("2 Crear un registro del dueño.");
            System.out.println("3 Asociar una mascota con un dueño");
            System.out.println("4 Mostrar informacion completa de un paciente");
            System.out.println("5 Indicar el costo a pagar por esterelizacion");
            System.out.println("6 Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Aqui se genera el objeto de tipo Mascota
                    do {
                        System.out.println("Ingresa el nombre de la mascota");
                        nombreMascota = sc.next();
                        flag = !validacion.validarCamposObligatorios(nombreMascota);
                        if (flag == false) {
                            System.out.println("Ingresa un nombre valido");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa la edad de la mascota");
                        edadMascota = sc.nextInt();
                        flag = validacion.validarEdad(edadMascota);
                        if (flag == false) {
                            System.out.println("Ingresa una edad valida (+0)");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa peso de la mascota");
                        pesoMascota = sc.nextInt();
                        flag = validacion.validarPesoMascota(pesoMascota);
                        if (flag == false) {
                            System.out.println("Ingresa un peso valido (+0 y -=50)");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa tipo de mascota");
                        tipoMascota = sc.next().toUpperCase();
                        flag = validacion.validarTipoMascota(tipoMascota);
                        if (flag == false) {
                            System.out.println("Ingresa un tipo de mascota valido (Gato 'G' o Perro 'P')");
                        }
                    } while (flag == false);
                    mc = new Mascota(nombreMascota, edadMascota, pesoMascota, tipoMascota);
                    break;
                case 2:
                    //Aqui se genera el objeto de tipo Dueño
                    do {
                        System.out.println("Ingresa el nombre del dueño");
                        nombreDueno = sc.next();
                        flag = !validacion.validarCamposObligatorios(nombreDueno);
                        if (flag == false) {
                            System.out.println("Ingresa un nombre valido");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa el apellido del dueño");
                        apellidoDueno = sc.next();
                        flag = !validacion.validarCamposObligatorios(apellidoDueno);
                        if (flag == false) {
                            System.out.println("Ingresa un apellido valido");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa el telefono del dueño");
                        telefonoDueno = sc.next();
                        flag = validacion.validarTelefono(telefonoDueno);
                        if (flag == false) {
                            System.out.println("El numero de telefono es invalido");
                        }

                    } while (flag == false);
                    do {
                        System.out.println("Ingresa el email del dueño");
                        emailDueno = sc.next();
                        flag = !validacion.validarCamposObligatorios(emailDueno);
                        if (flag == false) {
                            System.out.println("Ingresa un email valido");
                        }
                    } while (flag == false);
                    do {
                        System.out.println("Ingresa el rut del dueño");
                        rutDueno = sc.next();
                        flag = !validacion.validarCamposObligatorios(rutDueno);
                        if (flag == false) {
                            System.out.println("Ingresa un rut valido");
                        }
                    } while (flag == false);
                    dn = new Dueno(nombreDueno, apellidoDueno, telefonoDueno, emailDueno, rutDueno);
                    System.out.println("El dueño se creo exitosamente");
                    break;
                case 3:
                    // Aqui se asocia el dueño con la mascota
                    try {
                        mc.setDueno(dn);
                        System.out.println("El dueño se asocio correctamente con la mascota.");
                    } catch (NullPointerException e) {
                        System.out.println("El dueño no ha sido creado, cree el usuario e intente de nuevo");
                    }
                    break;
                case 4:
                    // Aqui se imprime los datos de la mascota
                    mc.imprimirInfoMAscota();
                    break;
                case 5:
                    // Aqui se imprime el costo de esterilazacion
                    long costoEsterelizacion = mc.costoEstelizacion();
                    System.out.println("La esterelizacion tiene un costo total de : $" + costoEsterelizacion);
                    break;
                case 6:
                    // Aqui es para salir del prograna
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevo con una opcion valida.1");
                    break;
            }
        } while (opcion != 6);
    }

}
