/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.bean.persistencia;

import basededatos.EventoBD;
import com.fieston.evento.entity.Evento;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.annotation.PostConstruct;

/**
 *
 * @author r
 */
@Stateless
public class EventoPersistenciaSB implements EventoPersistenciaSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public EventoBD eventos;
    
    
    
    public EventoPersistenciaSB(){
        init();
    }
    @PostConstruct
    private void init(){
        eventos = EventoBD.getInstance();
        Date fecha = new Date(System.currentTimeMillis());
        Evento evento1 = new Evento(fecha , 100,200,null,152123,"DECORACION");
    }
    
    @Override
    public void agregarEvento(Evento evento){
        eventos.agregarEvento(evento);
        System.out.println("EVENTO" + evento.toString());
    }
}
