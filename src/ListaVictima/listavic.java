/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaVictima;

/**
 *
 * @author eleaz
 */
public class listavic {
    private static String[] victimas = new String[100];
    private static int cantidad = 0;

    public static int buscar(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (victimas[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    } 
}
