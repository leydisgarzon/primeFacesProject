/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgg.primefaceexamp.managedBeansController;

import com.lgg.primefaceexamp.entities.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ley
 */
@ManagedBean
@ViewScoped
public class PersonaController {
    private List<Persona> personas = new ArrayList<>();
    private Persona persona = new Persona();

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void registarPersona(){
        personas.add(persona);
        persona = new Persona();
    }
    
    public List<Persona> listarPersonas(){
        return personas;
    }
}
