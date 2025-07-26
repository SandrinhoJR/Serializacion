/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;
import persistencia.Serializadora;

/**
 *
 * @author sandro rendon
 */
public class PersonaDAO {
    private final ArrayList<Persona> personas;
    private final Serializadora serializadoraPersona;

    public PersonaDAO() {
        this.serializadoraPersona = new Serializadora();
        this.personas = serializadoraPersona.getListaPersonas();
    }

    public ArrayList<Persona> getPersona() {
        return personas;
    }

    public boolean registrarPersona(Persona persona) {
        if (persona != null && buscarPersona(persona.getId()) == null) {
            personas.add(persona);
            serializadoraPersona.escribirPersona();
            return true;
        }
        return false;
    }

    public Persona buscarPersona(String id) {
        for (Persona persona : personas) {
            if (persona.getId().equals(id)) {
                return persona;
            }
        }
        return null;
    }

    public boolean eliminarPersona(String id) {
        Persona persona = buscarPersona(id);
        if (persona != null) {
            personas.remove(persona);
            serializadoraPersona.escribirPersona();
            return true;
        }
        return false;
    }

}

