/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieston.evento.serverlet;

import com.fieston.evento.bean.negocio.EventoSB;
import com.fieston.evento.bean.negocio.EventoSBLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rodrigo
 */
@WebServlet(name = "nuevoEventoServerlet", urlPatterns = {"/nuevoEvento"})
public class nuevoEventoServerlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            
            
             String fechaeventotxt = request.getParameter("fechaevento");
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/mm/yyyy");
            Date fechaevento = formatoDelTexto.parse(fechaeventotxt);
            
            int mayores = Integer.parseInt(request.getParameter("mayores"));
            int menores = Integer.parseInt(request.getParameter("menores"));
            String catering = request.getParameter("catering");
            String menu = request.getParameter("menu");
            
            // String fechasenatxt = request.getParameter("fechasena");
            //SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/mm/yyyy");
            Date fechasena =null;// formatoDelTexto.parse(fechaeventotxt);
            
            int nrorecibo = 23234234; //equest.getParameter("nrorecibo");
            String decoracion = request.getParameter("decoracion");
        
           eSB.agregarEvento(fechaevento, mayores, menores, fechasena, nrorecibo, decoracion);
            
            response.sendRedirect("login.html");
            
        }catch (Exception e) {
            System.out.println(e.toString());

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
