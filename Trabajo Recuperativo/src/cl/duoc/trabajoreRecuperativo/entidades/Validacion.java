/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.trabajoreRecuperativo.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Vicente Espinosa
 */
public class Validacion {

    public String toCapitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public boolean validarCategoria(String s) {
        return s.equals("Especialidad") || s.equals("Terror") || s.equals("Fantasia") || s.equals("Ficcion");
    }

    public boolean validarNumeroPositivo(int i) {
        return i > 0;
    }

    public boolean validarStringValida(String s) {
        return s.length() > 0;
    }

    public boolean validarISBN(String s) {
        return s.length() == 13;
    }

    public boolean validarFecha(int i) throws ParseException {
        return i >= 2000 && i <= 2021; 
    }

    public String separadorISBN(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) * 3 >= s.length()) {
                return newString.trim() + s.substring(s.length() - 1);
            }
            newString += s.substring(i * 3, (i + 1) * 3) + " ";
        }
        return newString;
    }
}
