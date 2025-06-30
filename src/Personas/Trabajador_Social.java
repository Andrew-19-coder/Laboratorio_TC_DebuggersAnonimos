/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Joan
 */
public class Trabajador_Social {
    private String Cedula;
    private String Nombre;
    private String Correo;
    private String Canton;

    public Trabajador_Social(String Cedula, String Nombre, String Correo, String Canton) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Canton = Canton;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCanton() {
        return Canton;
    }
    
    
    
}
