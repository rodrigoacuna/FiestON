/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.bean.negocio;

import com.fieston.evento.bean.persistencia.EventoPersistenciaSB;
import com.fieston.evento.entity.Evento;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author r
 */
@Stateless
public class EventoSB implements EventoSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB 
    EventoPersistenciaSB eSBLocal;
    
    @Override
    public void agregarEvento(Date fecha, int cantInvitadosMayores, int cantInvitadosMenores, Date fechaSena, int nroRecibo, String decoracion){
    
        Evento evento = new Evento();
    
    evento.setFecha(null);
    evento.setCantInvitadosMayores(cantInvitadosMayores);
    evento.setCantInvitadosMenores(cantInvitadosMenores);
    evento.setFechaSena(null);
    evento.setNroRecibo(nroRecibo);
    evento.setDecoracion("deoracion");
        //sevento = new Evento(fecha, cantInvitadosMayores, cantInvitadosMenores, fechaSena, nroRecibo, decoracion);
    
    //eSBLocal.agregarEvento(evento);
    
    }
    
}
