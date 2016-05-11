/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import com.fieston.evento.entity.Evento;
import com.fieston.usuario.entity.Usuario;
import java.util.ArrayList;

/**
 *
 * @author r
 */
public class EventoBD {
    private static EventoBD listas;
    
    private ArrayList<Evento> eventos;

   
    public static EventoBD getInstance(){
        if(listas.listas == null){
            return new EventoBD();
        }else{
            return listas.listas;
        }
    }

    public EventoBD() {
        this.eventos = new ArrayList<>();
    }
    
    
    public EventoBD(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

   
    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void agregarEvento(Evento evento){
        this.eventos.add(evento);
    }
    public boolean existeEvento(Evento evento){
        return this.eventos.contains(evento);
    }
    
    
}
