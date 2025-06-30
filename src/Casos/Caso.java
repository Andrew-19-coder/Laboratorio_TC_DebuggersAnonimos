/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;
import Personas.Victima;
import java.time.LocalDate;
/**
 *
 * @author Jeshuan
 */
public class Caso {
    Victima victima;
    private String cedula;
    private String descripcion;
    private LocalDate fecha_registro;
    Prioridad prioridad;
    private String tipo;
    public Victima getVictima() {
        return victima;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public String getTipo() {
        return tipo;
    }

    public Caso(Victima victima, String cedula, String descripcion, LocalDate fecha_registro, Prioridad prioridad, String tipo) {
        this.victima = victima;
        this.cedula = cedula;
        this.descripcion = descripcion;
        this.fecha_registro = fecha_registro;
        this.prioridad = prioridad;
        this.tipo = tipo;
    }
    
    
    
}
