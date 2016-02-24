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
public class Renta {
    private Pelicula pelicula; 
    private int diasRenta; 

    public Renta(Pelicula pelicula, int diasRenta) {
        this.pelicula = pelicula;
        this.diasRenta = diasRenta;
    }

    public Pelicula pelicula(){
        return pelicula; 
    }
    
    public double cobro(){
        double cobro=this.diasRenta*1000;
        return cobro; 
    }
}
