/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.bean.negocio;

import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author r
 */
@Local
public interface EventoSBLocal {
    public void agregarEvento(Date fecha, int cantInvitadosMayores, int cantInvitadosMenores, Date fechaSena, int nroRecibo, String decoracion);
    
}
