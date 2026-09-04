/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginproyecto;

/**
 *
 * @author MR CHAMAN
 */
public class Jugador {
    
    public String id;
    public String nombre;
    public int edad;
    public String posicion;
    
    
    public Jugador(String id, String nombre, int edad, String posicion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public String getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }
}