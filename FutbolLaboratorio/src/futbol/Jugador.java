/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

/**
 *
 * @author Guada
 */
public class Jugador {
    
    

    private String nombreJugador;
    private int posicion;
    private int numero;
    private int cantPartidos;

    private int EstadoFisico;

     public String getNombre() {
        return nombreJugador;
         
     }

     public void setNombre(String nombreJugador) {
        this.nombreJugador = nombreJugador;
     }

     public int getPosicion() {
        return posicion;
     }

     public void setPosicion(int posicion) {
           this.posicion = posicion;
     }

     public int getNroCamiseta() {
        return numero;
     }

     public void setNroCamiseta(int numero) {
        this.numero = numero;
     }

     public int getCantPartidosJugados() {
        return cantPartidos;
     }

     public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidos = cantPartidosJugados;
     }

     public int getEstadoFisico() {
        return EstadoFisico;
     }

     public void setEstadoFisico(int PorcentajeEstadoF) {
        this.EstadoFisico = PorcentajeEstadoF;
     }

     public Jugador(String nombreJugador, int posicion, int numCamiseta, int cantPartidosJugados, int PorcentajeEstadoF) {
         this.nombreJugador = nombreJugador;
         this.posicion = posicion;
         this.numero = numCamiseta;
         this.cantPartidos = cantPartidosJugados;
         this.EstadoFisico = PorcentajeEstadoF;
     }




    
}




