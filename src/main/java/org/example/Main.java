package org.example;

import org.example.clase.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        //Jugador objetoJugador = new Jugador();

        System.out.println("*************Mundial**************");
        System.out.println("***********************************");

        //MENU
        int variableDeControl = 0;

        System.out.println("MENU DEL JUEGO");
        System.out.println("**************");
        System.out.println("0. SALIR");
        System.out.println("1. Agregar Jugador");
        System.out.println("2. Digite el Numero del Jugador");
        System.out.println("3. Editar informacion del Jugador");
        System.out.println("4. Mostrar la convocatoria");


        do {
            System.out.println("Digite un opcion del menu: ");
            variableDeControl = entradaPorTeclado.nextInt();

            switch (variableDeControl) {

                case 1:
                   /* System.out.println("Digite nombre del jugador: ");
                    objetoJugador.setNombre(entradaPorTeclado.next());

                    System.out.println("Digite el apellido del jugador: ");
                    objetoJugador.setApellidos(entradaPorTeclado.next());

                    System.out.println("Digite la edad del jugador: ");
                    objetoJugador.setEdad(entradaPorTeclado.nextInt());

                    System.out.println("Digite el numero de la camisa del jugador: ");
                    objetoJugador.setNumeroCamiseta(entradaPorTeclado.nextInt());

                    System.out.println("Digite la posicion del jugador: ");
                    objetoJugador.setPosicion(entradaPorTeclado.next());

                    System.out.println("Digite el equipo en el que juega del jugador: ");
                    objetoJugador.setEquipoDondeJuega(entradaPorTeclado.next());*/
                    if (jugadores.size() <= 23) {
                        Jugador objetoJugador = new Jugador();
                        objetoJugador.agregarJugador();
                        jugadores.add(objetoJugador);
                    } else {
                        System.out.println("No es permitido mas jugadores");
                    }

                    break;

                case 2:
                    String busquedaCamiseta;
                    System.out.print("Ingrese  numero de la camiseta del jugador: ");
                    busquedaCamiseta = entradaPorTeclado.next();
                    String nombreJugador = "";

                    for (Jugador jugador : jugadores) {
                        if (jugador.getNumeroCamiseta().equals(busquedaCamiseta)) {
                            nombreJugador = jugador.getNombre();
                            System.out.println("El nombre del jugador con este numero de camiseta es: " + nombreJugador);
                            break;
                        }

                        if (nombreJugador.equals("")) {
                            System.out.println("El jugador no existe");
                        }

                    }
                    break;
                case 3: {
                    busquedaCamiseta = "";
                    System.out.print("Ingrese numero de la camiseta del jugador: ");
                    busquedaCamiseta = entradaPorTeclado.next();
                    boolean editJugador = false;
                    for (Jugador jugador : jugadores) {
                        if (jugador.getNumeroCamiseta().equals(busquedaCamiseta)) {
                            System.out.println("El nombre del jugador es: " + jugador.getNombre() + "; Ingrese el nuevo nombre: ");
                            jugador.setNombre(entradaPorTeclado.next());
                            System.out.println("El nuevo nombre es: " + jugador.getNombre());
                            editJugador = true;
                            break;
                        }
                    }
                    if (!editJugador) {
                        System.out.println("El jugador no existe");
                    }
                }
                break;

                case 4:
                    System.out.println("La formacion de jugadores seleccionados para el encuentro es la siguiente: \n");
                    for (Jugador jugador : jugadores) {
                        System.out.println(jugador.getNombre() + " " + jugador.getPosicion() + " numero " + jugador.getNumeroCamiseta());
                    }
                    break;

                case 5:
                    break;
                default:
                    System.out.print("Ingresa una opción valida para el menu");

            }

            }
            while (variableDeControl != 0) ;



    }
}