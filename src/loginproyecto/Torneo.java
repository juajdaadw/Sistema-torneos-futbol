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
public class Torneo {
    
    public String nombreTorneo;
    public ArrayList<Equipos> listaEquipos;

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
        this.listaEquipos = new ArrayList<>();
    }

    public void inscribirEquipo(Equipos equipo) {
        if (equipo != null) {
            this.listaEquipos.add(equipo);
        }
    }
    
    public ArrayList<Equipos> getListaEquipos() {
        return listaEquipos;
    }
}
