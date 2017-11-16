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
public class Juego {
    
    private String nombre;
    private Jugador participantes[];
    
    public Juego(String nombre) {
        this.nombre = nombre;
        this.participantes = new Jugador[5];
    }

    public Juego(String nombre, Jugador[] participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }
    
    public Jugador[] ganadores(){
    Jugador vGanadores[] = new Jugador[3];
    
    int nMayor = participantes[0].getPuntuacion();
    vGanadores[0] = participantes[0];
    
        for (int i = 1; i < participantes.length; i++) {
            
            if (participantes[i].getPuntuacion() > nMayor){           
            nMayor = participantes[i].getPuntuacion();
            vGanadores[0]=participantes[i];           
            }        
        }
        
         for (int i = 1; i < participantes.length; i++) {
            
            if (participantes[i].getPuntuacion() > nMayor){           
            nMayor = participantes[i].getPuntuacion();
            vGanadores[0]=participantes[i];           
            }        
        }
         
          for (int i = 1; i < participantes.length; i++) {
            
            if (participantes[i].getPuntuacion() > nMayor){           
            nMayor = participantes[i].getPuntuacion();
            vGanadores[0]=participantes[i];           
            }        
        }
    
        return null;
    }
    
    private int buscarHueco(){
    
        for (int i = 0; i < participantes.length; i++) {
            if(participantes[i] == null){
                return i;}
            
        }
        
                 return -1;
        
    }
    
    public boolean anadirParticipante(Jugador Nombre){
    
       int hueco = buscarHueco();
       
       if (hueco==-1){
           return false;
       }
       else{
           participantes[hueco]=Nombre;
           return true;
       }
    
    }
    
    public boolean puntosJugador(int puntos,String nombre){
    
        for (int i = 0; i < participantes.length; i++) {
          if ((participantes[i]!=null)&&(participantes[i].getNombre().equalsIgnoreCase(nombre))){
              participantes[i].setPuntuacion(puntos);
              return true;
          }
        }
        
    return false;
    }
    
    public String verJugadores(){
    
    
        return null;
    }
    
    
    
}
