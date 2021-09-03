/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaminng;


import cl.duoc.Entidades.Cancion.Cancion;

/**
 *
 * @author cvveg
 */
public class Streaminng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion cancion1 = new Cancion("Believer", "Imagine Dragons", 300, true, true);
        cancion1.printSong();
        cancion1.compareSong();
        cancion1.advanceTime(200, 60);
        
        System.out.println("");
        System.out.println("########################################################");
        System.out.println("");
        
        Cancion cancion2 = new Cancion("Believer", "Imagine Dragons", 300, true, true);
        cancion2.setDescargada(false);
        cancion2.setFavorito(false);
        cancion2.setTitulo("Birds");
        cancion2.setDuracion(180+39);
        
        cancion2.printSong();
        cancion2.compareSong();
        cancion2.advanceTime(200, 10);
    }
    
}
