/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.store;

/**
 *
 * @author Diego Chacon  
 */
public class VideoStore {

    public static void main(String[] args) {
     
       // TODO code application logic here
        Pelicula p1= new Pelicula("Guerra de las galaxias"); 
        Renta prestamo= new Renta(p1, 11);
        System.out.println("Pagar: "+ prestamo.cobro());
    }
    
}

