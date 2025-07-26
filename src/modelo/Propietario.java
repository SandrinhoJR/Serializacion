/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sandro rendon
 */

    
   public class Propietario extends Persona {

    private String telefono;

    public Propietario(String nombre, String id, String telefono) {
        super(nombre, id); 
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getTipo() {
        return "Propietario";
    }
}

