/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgg.primefaceexamp.managedBeansController;

import com.lgg.primefaceexamp.entities.Categoria;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import org.slf4j.LoggerFactory;

/**
 *
 * @author ley
 */
@ManagedBean
@SessionScoped
public class CategoriaController implements Serializable{
    private Categoria categoria = new Categoria();
    private Date dateCalendar;

    public Date getDateCalendar() {
        return dateCalendar;
    }

    public void setDateCalendar(Date dateCalendar) {
        this.dateCalendar = dateCalendar;
    }
    //private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CategoriaController.class);
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void registrar(){
        categoria.setNombre("Artes");
       // logger.debug("se guarda la categoria" + categoria.getNombre());
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
}
