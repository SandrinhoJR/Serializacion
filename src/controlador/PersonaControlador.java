/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.PersonaDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author sandro rendon
 */
public class PersonaControlador {
    
   private final PersonaDAO daoPersona;

    public PersonaControlador() {
        this.daoPersona = new PersonaDAO();
    }

    public boolean guardarPersona(Persona persona) {
        return daoPersona.registrarPersona(persona);
    }

    public Persona buscarPersona(String documento) {
        return daoPersona.buscarPersona(documento);
    }

    public boolean eliminarPersona(String documento) {
        return daoPersona.eliminarPersona(documento);
    }

    public static boolean validarPersona(String nombre, String documento) {
        return nombre != null && !nombre.isEmpty() && documento != null && documento.matches("\\d+");
    }
    
    public ArrayList<Persona> listar(){
        return daoPersona.getPersona();
    }
}
