/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginproyecto;

import java.util.ArrayList;

/**
 *
 * @author MR CHAMAN
 */
public class Equipos {
    public String id;
    public String nombre, entrenador;
    public ArrayList<Jugador> listaJugadores;
    
    public Equipos(String id, String nombre, String entrenador){
        this.id = id;
        this.nombre = nombre;
        this.entrenador = entrenador;
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
    
    public void eliminarJugadorPorId(String idJugador) {
        for (Jugador j : listaJugadores) {
            if (j.getId().equalsIgnoreCase(idJugador)) {
                listaJugadores.remove(j);
                return;
            }
        }
    }
    
    public int getCantidadJugadores() {
        return this.listaJugadores.size();
    }
}
