/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittecnoland;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Inicio {

       public static int pintaMenu(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        
           System.out.println("***************************");
           System.out.println("*1-Ver juegos             *");
           System.out.println("*2-Seleccionar juego      *");
           System.out.println("*3-Añadir juego           *");
           System.out.println("*4-Salir                  *");
           System.out.println("***************************");
           
                      
           System.out.print("Opcion------->");
           opcion=sc.nextInt();
           
        
        return opcion;
    }
       
       public static int pintaMenuJuego(){
        
            int opcion;
            Scanner leer = new Scanner(System.in);
        
           System.out.println("***************************");
           System.out.println("*1-Mostrar ganadores      *");
           System.out.println("*2-Añadir Participantes   *");
           System.out.println("*3-Añadir puntos          *");
           System.out.println("*4-Ver jugadores          *");
           System.out.println("*5-Salir                  *");
           System.out.println("***************************");
           
                      
           System.out.print("Opcion------->");
           opcion=leer.nextInt();
           
        
        return opcion;
           
    }
       
    public static void main(String[] args) {
    
        boolean salir=false, salir2=false;
        
        Scanner juego = new Scanner(System.in);
        
        int opcionMenu,opcionMenuJuego;
        
        Jugador j1 = new Jugador("jose",19);
        Jugador j2 = new Jugador("juan",25);
        
        Juego fifa = new Juego("FIFA");
        Juego cod = new Juego("COD");
        
        Tecnoland t1 = new Tecnoland(2017);
        
        fifa.anadirParticipante(j1);
        cod.anadirParticipante(j2);
        
        t1.anadirJuego(fifa);
        t1.anadirJuego(cod);
        
        
        
        while (salir==false){
            
        opcionMenu=pintaMenu();
        
        switch (opcionMenu) {
            case 1: 
                System.out.println(t1.verJuegos());
                break;
            case 2:
                String nombre;
                int num;
                System.out.println("Nombre del juego a seleccionar");
                nombre = juego.nextLine();
                Juego juegoSeleccionado = t1.seleccionarJuego(nombre);
                while (salir==false){
                
                    opcionMenuJuego=pintaMenuJuego();
                
                    switch (opcionMenuJuego) {
                            case 1:    
                                break;
                            case 2:    
                                break;
                            case 3:    
                                break;
                            case 4:    
                                break;
                            case 5:    
                                break;          
                    }
                }
                break;
            case 3: 
                String nombreJuego;
                System.out.println("Nombre juego nuevo");
                nombreJuego = juego.nextLine();
                t1.anadirJuego(new Juego(nombreJuego));
                break;
            case 4: 
                salir=true;
                break;
            default: 
                break;
        
       }
      }
    
  
    }
    
}
