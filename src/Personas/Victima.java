/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author itsth
 */
public class Victima {
    
     private String cedula;
     private String nombre;
     private LocalDate fechaNacimiento;
     private String genero;
     private String correo;
     private String telefono;
     private String direccion;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Victima(String cedula, String nombre, LocalDate fechaNacimiento, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public static int calcularEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        if(fechaNacimiento != null && fechaNacimiento.isAfter(hoy)){
            return Period.between(fechaNacimiento, hoy).getYears();
        }else{
            return -1;
        }
    }
}