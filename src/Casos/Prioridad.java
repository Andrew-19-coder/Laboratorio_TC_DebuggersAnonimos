/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Casos;

/**
 *
 * @author Jeshuan
 */
public enum Prioridad {
    ALTA("Alta"),
    MEDIA("Media"),
    BAJA("Baja");
    private final String prioridad;

    public String getPrioridad() {
        return prioridad;
    }

    private Prioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}
