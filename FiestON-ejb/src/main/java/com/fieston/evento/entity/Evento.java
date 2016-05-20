/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.entity;

import java.util.Date;

/**
 *
 * @author R
 */
public class Evento {
    private Date fecha;
    private int cantInvitadosMayores;
    private int cantInvitadosMenores;
    //Catering catering;
    //Menu menu;
    private Date fechaSena;
    private int nroRecibo;
    //Decoracion decoracion;
    private String decoracion;

    public Evento() {
    }
    
    public Evento(Date fecha, int cantInvitadosMayores, int cantInvitadosMenores, Date fechaSena, int nroRecibo, String decoracion) {
        this.fecha = fecha;
        this.cantInvitadosMayores = cantInvitadosMayores;
        this.cantInvitadosMenores = cantInvitadosMenores;
        this.fechaSena = fechaSena;
        this.nroRecibo = nroRecibo;
        this.decoracion = decoracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantInvitadosMayores() {
        return cantInvitadosMayores;
    }

    public void setCantInvitadosMayores(int cantInvitadosMayores) {
        this.cantInvitadosMayores = cantInvitadosMayores;
    }

    public int getCantInvitadosMenores() {
        return cantInvitadosMenores;
    }

    public void setCantInvitadosMenores(int cantInvitadosMenores) {
        this.cantInvitadosMenores = cantInvitadosMenores;
    }

    public Date getFechaSena() {
        return fechaSena;
    }

    public void setFechaSena(Date fechaSena) {
        this.fechaSena = fechaSena;
    }

    public int getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(int nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    @Override
    public String toString() {
        return "Evento{" + "Mayores=" + cantInvitadosMayores + '}';
    }
    
        
    
    
}
