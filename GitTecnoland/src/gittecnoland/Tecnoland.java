/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittecnoland;

/**
 *
 * @author alumno
 */
public class Tecnoland {

     private int edicion;
    private Juego vJuegos[];

    public Tecnoland(int edicion) {
        this.edicion = edicion;
        this.vJuegos = new Juego[5];
    }
    
    public String verJuegos(){
        
        String juegos="";
            
        for (int i = 0; i < vJuegos.length; i++) {
            if (vJuegos[i]!=null)
            juegos+=vJuegos[i].getNombre() + "\n";
        }
        
        return juegos;
    }
    
    public Juego seleccionarJuego(String nombreJuego){
        
        for (int i = 0; i < vJuegos.length; i++) {
            if (vJuegos[i].getNombre().equalsIgnoreCase(nombreJuego)){
            return vJuegos[i];
            }
        }
            return null;
    }
    
        private int buscarHueco(){
    
        for (int i = 0; i < vJuegos.length; i++) {
            if(vJuegos[i] == null){
                return i;}
            
        }
        
                 return -1;
        
    }
    
    public boolean anadirJuego(Juego juegoNuevo){
        
         int hueco = buscarHueco();
       
       for (int i = 0; i < vJuegos.length; i++) {
            if ((vJuegos[i]!=null) && (vJuegos[i].getNombre().equalsIgnoreCase(juegoNuevo.getNombre()))){
            return false;
            }
        }
         
        if (hueco==-1){
           return false;
        }
        else{
           vJuegos[hueco]=juegoNuevo;
           return true;
        }
        
    }
    
}
