/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.util.Scanner;

/**
 *
 * @author Guada
 */
public class Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Jugador [] jugadores;

        

        System.out.println("Ingrese la cantidad de jugadores: ");

        int cantJugadores = sc.nextInt();

        

        jugadores = new Jugador[cantJugadores];

        

        for (int i = 0; i < jugadores.length; i++) {

            sc.nextLine();

            System.out.println("Ingrese el nombre del jugador " + (i + 1));

            String nombre = sc.nextLine();

            System.out.println("Ingrese la posicion del jugador " + (i + 1));

            int posicion = sc.nextInt();

            System.out.println("Ingrese la nro de camiseta del jugador " + (i + 1));

            int camiseta = sc.nextInt();

            System.out.println("Ingrese la cantidad de partidos jugados del jugador " + (i + 1));

            int partidos = sc.nextInt();

            System.out.println("Ingrese el estado fisico del jugador " + (i + 1));

            int estadoFisico = sc.nextInt();

            

            jugadores[i] = new Jugador(nombre, posicion, camiseta, partidos, estadoFisico);

        }

        

        // Cantidad de jugadores con menos de 10 partidos jugados.

        int cantidadJugadoresMenos10 = 0;

        for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null && jugadores[i].getCantPartidosJugados() < 10)

                cantidadJugadoresMenos10++;

        }

        

        System.out.println("Hay " + cantidadJugadoresMenos10 + " jugadores con menos de 10 partidos.");

        

        

        // Nombre del jugador con mayor cantidad de partidos jugados

        Jugador auxiliar = jugadores[0];

        for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null && jugadores[i].getCantPartidosJugados() > auxiliar.getCantPartidosJugados())

                auxiliar = jugadores[i];

        }

        

        System.out.println("El jugador con mayor cantidad de partidos jugados es  " + auxiliar.getNombre());

        

        

        // Promedio de estado físico de todo el equipo.

        int acumuladorEstadoFisico = 0;

        int contadorJugadores = 0;

        for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null)

            {

                acumuladorEstadoFisico += jugadores[i].getEstadoFisico();

                contadorJugadores++;

            }

        }

        

        System.out.println("El promedio de estado físico del equipo es " + acumuladorEstadoFisico / contadorJugadores);

        

        // Estado físico de un jugador particular identificado por número de camiseta.

        System.out.println("Ingrese un número de camiseta: ");

        int nroCamiseta = sc.nextInt();

        int estadoFisicoEncontrado = 0;

        for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null && jugadores[i].getNroCamiseta() == nroCamiseta)

            {

                estadoFisicoEncontrado = jugadores[i].getEstadoFisico();

                break;

            }

        }

        

        System.out.println("El estado fisico del jugador con el numero de camiseta " + nroCamiseta + ", es " + estadoFisicoEncontrado);

        

        // Promedio de partidos jugados de los jugadores de cada posición (4 resultados).

        int [] acumuladorPosiciones = new int[4];

        int [] contadorPosiciones = new int[4];

        for (int i = 0; i < jugadores.length; i++) {

            if(jugadores[i] != null)

            {

                switch(jugadores[i].getPosicion())

                {

                    case 1:

                        acumuladorPosiciones[0] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[0]++;

                        break;

                    case 2:

                        acumuladorPosiciones[1] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[1]++;

                        break;

                    case 3:

                        acumuladorPosiciones[2] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[2]++;

                        break;

                    case 4:

                        acumuladorPosiciones[3] += jugadores[i].getCantPartidosJugados();

                        contadorPosiciones[3]++;

                        break;

                }

            }

        }

        

        System.out.println("El promedio de partidos jugados de la posicion 1 es: " + (double)acumuladorPosiciones[0] / contadorPosiciones[0]);

        System.out.println("El promedio de partidos jugados de la posicion 2 es: " + (double)acumuladorPosiciones[1] / contadorPosiciones[1]);

        System.out.println("El promedio de partidos jugados de la posicion 3 es: " + (double)acumuladorPosiciones[2] / contadorPosiciones[2]);

        System.out.println("El promedio de partidos jugados de la posicion 4 es: " + (double)acumuladorPosiciones[3] / contadorPosiciones[3]);

        

        

        ///////EJEMPLO PRIMER PARTE DE LA CLASE///////

        

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de personas: ");

        int cantidad = sc.nextInt();

        

        Persona [] personas = new Persona[cantidad];

        for (int i = 0; i < personas.length; i++) {

            System.out.println("Ingrese el peso de la persona " + (i + 1));

            double peso = sc.nextDouble();

            personas[i] = new Persona(peso);

        }

        

        double acumuladorPesos = 0;

        for (int i = 0; i < personas.length; i++) {

            acumuladorPesos += personas[i].getPeso();

        }

        

        System.out.println("El promedio de pesos es: " + acumuladorPesos / personas.length);

        

        

        

        System.out.println("Ingrese " + cantidad + " números: ");

        int [] arregloPesos = new int[cantidad];

        for (int i = 0; i < arregloPesos.length; i++) {

            arregloPesos[i] = sc.nextInt();

        }

        

        int acumulador = 0;

        

        for (int i = 0; i < arregloPesos.length; i++) {

            acumulador += arregloPesos[i];

        }

        

        System.out.println((double)acumulador / arregloPesos.length);

        */
        // TODO code application logic here
    }
    
}




       

