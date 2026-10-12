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
public class Torneo {
    
    private String nombreTorneo;
    private ArrayList<Equipos> listaEquipos;

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
        this.listaEquipos = new ArrayList<>();
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void inscribirEquipo(Equipos equipo) {
        if (equipo != null) {
            this.listaEquipos.add(equipo);
        }
    }

    public boolean existeEquipo(String nombre) {
        for (Equipos e : listaEquipos) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Equipos> getListaEquipos() {
        return listaEquipos;
    }
}
