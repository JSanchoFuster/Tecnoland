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
    int nMayor2 = participantes[0].getPuntuacion();
    int nMayor3 = participantes[0].getPuntuacion();
    vGanadores[0] = participantes[0];
    
        for (int i = 1; i < participantes.length; i++) {
            
            if (participantes[i].getPuntuacion() >= nMayor){           
            nMayor = participantes[i].getPuntuacion();
            vGanadores[0]=participantes[i];           
            }        
        }
        
         for (int i = 1; i < participantes.length; i++) {
            
            if ((participantes[i].getPuntuacion() < nMayor) && (participantes[i].getPuntuacion() >= nMayor2)){           
            nMayor2 = participantes[i].getPuntuacion();
            vGanadores[1]=participantes[i];           
            }        
        }
         
          for (int i = 1; i < participantes.length; i++) {
            
            if ((participantes[i].getPuntuacion() < nMayor2) && (participantes[i].getPuntuacion() >= nMayor3)){           
            nMayor3 = participantes[i].getPuntuacion();
            vGanadores[2]=participantes[i];           
            }        
        }
    
        return vGanadores;
    }
    
    private int buscarHueco(){
    
        for (int i = 0; i < participantes.length; i++) {
            if(getParticipantes()[i] == null){
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
            getParticipantes()[hueco]=Nombre;
           return true;
       }
    
    }
    
    public boolean puntosJugador(int puntos,String nombre){
    
        for (int i = 0; i < participantes.length; i++) {
          if ((getParticipantes()[i]!=null)&&(getParticipantes()[i].getNombre().equalsIgnoreCase(nombre))){
                getParticipantes()[i].setPuntuacion(puntos);
              return true;
          }
        }
        
    return false;
    }
    
    public String verJugadores(){
        
        String jugadores="";
            
        for (int i = 0; i < participantes.length; i++) {
            jugadores+=getParticipantes()[i].getNombre() + "|" + getParticipantes()[i].getEdad() + "\n";
        }
        
        return jugadores;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the participantes
     */
    public Jugador[] getParticipantes() {
        return participantes;
    }

    /**
     * @param participantes the participantes to set
     */
    public void setParticipantes(Jugador[] participantes) {
        this.participantes = participantes;
    }
    
    
    
}
