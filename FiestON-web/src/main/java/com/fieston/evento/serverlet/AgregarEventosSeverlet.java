/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.serverlet;

import com.fieston.evento.bean.negocio.EventoSBLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rodrigo
 */
public class AgregarEventosSeverlet extends HttpServlet {

     @EJB
    EventoSBLocal eSB;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String fechaeventotxt = "01/01/2016"; //request.getParameter("fechaevento");
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/mm/yyyy");
            Date fechaevento = formatoDelTexto.parse(fechaeventotxt);
            
            int mayores = 10; //Integer.parseInt(request.getParameter("mayores"));
            int menores = 20;//Integer.parseInt(request.getParameter("menores"));
            String catering = request.getParameter("catering");
            String menu = request.getParameter("menu");
            
            // String fechasenatxt = request.getParameter("fechasena");
            //SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/mm/yyyy");
            Date fechasena =null;// formatoDelTexto.parse(fechaeventotxt);
            
            int nrorecibo = 223; //equest.getParameter("nrorecibo");
            String decoracion = request.getParameter("decoracion");
        
           eSB.agregarEvento(fechaevento, 0, 0, fechasena, 0, decoracion);
            
            response.sendRedirect("login.html");
            
        }catch (Exception e) {
            System.out.println("EEEERRROOOORRRRR " + e.toString());

        }
        }
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
