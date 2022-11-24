package org.example.clase;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private int edad;
    private String apellidos;
    private String numeroCamiseta;
    private String posicion;
    private String equipoDondeJuega;

    //constructor


    public Jugador() {
    }

    public Jugador(String nombre, int edad, String apellidos, String numeroCamiseta, String posicion, String equipoDondeJuega) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.equipoDondeJuega = equipoDondeJuega;
    }
    //Metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }


    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta=numeroCamiseta;

    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipoDondeJuega() {
        return equipoDondeJuega;
    }

    public void setEquipoDondeJuega(String equipoDondeJuega) {
        this.equipoDondeJuega = equipoDondeJuega;
    }

    public void agregarJugador(){
        Scanner entradaPorteclado=new Scanner(System.in);
        System.out.print("Nombre: ");
        this.setNombre(entradaPorteclado.next());
        System.out.println("Apellido: ");
        this.setApellidos(entradaPorteclado.next());
        System.out.println("Edad: ");
        this.setEdad(entradaPorteclado.nextInt());
        System.out.println("Posicion: ");
        this.setPosicion(entradaPorteclado.next());
        System.out.println("Numero Camisa: ");
        this.setNumeroCamiseta(entradaPorteclado.next());
        System.out.println("Equipo donde juega: ");
        this.setEquipoDondeJuega(entradaPorteclado.next());
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }
}
