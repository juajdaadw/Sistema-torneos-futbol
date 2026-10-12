/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author MR CHAMAN
 */
public class Equipos {
    private String id;
    private String nombre, entrenador;
    private ArrayList<Jugador> listaJugadores;
    private int cantidadJugadores;
    
    public Equipos(String id, String nombre, String entrenador, int cantidadJugadores){
        this.id = id;
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.cantidadJugadores = cantidadJugadores;
        this.listaJugadores = new ArrayList<>();
    }
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEntrenador(){
        return entrenador;
    }
    
    public void agregarJugador(Jugador jugador) {
        if (jugador != null) {
            this.listaJugadores.add(jugador);
        }
    }
    
    public int getCantidadJugadores() {
        if (listaJugadores.isEmpty()) {
            return cantidadJugadores;
        }
        return listaJugadores.size();
    }
}
