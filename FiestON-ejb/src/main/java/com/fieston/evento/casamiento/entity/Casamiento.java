/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.casamiento.entity;

/**
 *
 * @author R
 */
public class Casamiento {
    
    private String nombreNovio;
    private String nombreNovia;
    
    private String ciNovio;
    private String ciNovia;
    
    private int telefonoNovio;
    private int telefonoNovia;
    
    private String mailNovio;
    private String mailNovia;
    
    private String fechaNacNovio;
    private String fechaNacNovia;

    public Casamiento() {
    }

    
    public Casamiento(String nombreNovio, String nombreNovia, String ciNovio, String ciNovia, int telefonoNovio, int telefonoNovia, String mailNovio, String mailNovia, String fechaNacNovio, String fechaNacNovia) {
        this.nombreNovio = nombreNovio;
        this.nombreNovia = nombreNovia;
        this.ciNovio = ciNovio;
        this.ciNovia = ciNovia;
        this.telefonoNovio = telefonoNovio;
        this.telefonoNovia = telefonoNovia;
        this.mailNovio = mailNovio;
        this.mailNovia = mailNovia;
        this.fechaNacNovio = fechaNacNovio;
        this.fechaNacNovia = fechaNacNovia;
    }

    public String getNombreNovio() {
        return nombreNovio;
    }

    public void setNombreNovio(String nombreNovio) {
        this.nombreNovio = nombreNovio;
    }

    public String getNombreNovia() {
        return nombreNovia;
    }

    public void setNombreNovia(String nombreNovia) {
        this.nombreNovia = nombreNovia;
    }

    public String getCiNovio() {
        return ciNovio;
    }

    public void setCiNovio(String ciNovio) {
        this.ciNovio = ciNovio;
    }

    public String getCiNovia() {
        return ciNovia;
    }

    public void setCiNovia(String ciNovia) {
        this.ciNovia = ciNovia;
    }

    public int getTelefonoNovio() {
        return telefonoNovio;
    }

    public void setTelefonoNovio(int telefonoNovio) {
        this.telefonoNovio = telefonoNovio;
    }

    public int getTelefonoNovia() {
        return telefonoNovia;
    }

    public void setTelefonoNovia(int telefonoNovia) {
        this.telefonoNovia = telefonoNovia;
    }

    public String getMailNovio() {
        return mailNovio;
    }

    public void setMailNovio(String mailNovio) {
        this.mailNovio = mailNovio;
    }

    public String getMailNovia() {
        return mailNovia;
    }

    public void setMailNovia(String mailNovia) {
        this.mailNovia = mailNovia;
    }

    public String getFechaNacNovio() {
        return fechaNacNovio;
    }

    public void setFechaNacNovio(String fechaNacNovio) {
        this.fechaNacNovio = fechaNacNovio;
    }

    public String getFechaNacNovia() {
        return fechaNacNovia;
    }

    public void setFechaNacNovia(String fechaNacNovia) {
        this.fechaNacNovia = fechaNacNovia;
    }

    @Override
    public String toString() {
        return "Casamiento{" + "Novio=" + nombreNovio + ", Novia=" + nombreNovia + '}';
    }
    
    
    
}
