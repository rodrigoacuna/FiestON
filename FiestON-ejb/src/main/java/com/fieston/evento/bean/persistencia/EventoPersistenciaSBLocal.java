/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.bean.persistencia;

import com.fieston.evento.entity.Evento;
import javax.ejb.Local;

/**
 *
 * @author r
 */
@Local
public interface EventoPersistenciaSBLocal {
    public void agregarEvento(Evento evento);
}
