/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.store;

/**
 *
 * @author Estudiante
 */
public class Pelicula {
    public String titulo; 

    public Pelicula(String titulo) {
        this.titulo=titulo; 
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
}
