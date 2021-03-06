/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midterms.servlet;

import com.midterms.db.ProductDB;
import com.midterms.db.UserDB;
import com.midterms.model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author John Agustin
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        String submit = request.getParameter("submit");

        if (submit.equalsIgnoreCase("cancel")) {
            response.sendRedirect(this.getServletContext().getContextPath() + "/private/welcome.jsp");
        } else {
            //validation
            List<String> addErrMsg = new ArrayList<>();
            
            addErrMsg.add((name == null || name.equals("")) ? "Product must have a name" : "");
            addErrMsg.add((price == null || price.equals("")
                    || ((!price.equals("")) && (!(Double.parseDouble(price) >= 1 && Double.parseDouble(price) <= 850))))
                    ? "Price must be between $1-850"
                    : "");
            // get product
            Product existingProd = ProductDB.getProduct(name);
            addErrMsg.add(0, existingProd == null ? "" : "Product name already exists. You cannot have products with same name");
            
            request.setAttribute("addErrMsg", addErrMsg);
            if (existingProd != null || name == null || name.equals("") || price == null || price.equals("")
                    || ((!price.equals("")) && ((!(Double.parseDouble(price) >= 1 && Double.parseDouble(price) <= 850))))) {
                
                request.setAttribute("prod", new Product(name, null, description));
                RequestDispatcher view = request.getRequestDispatcher("/private/add.jsp");
                view.forward(request, response);
            } else if (ProductDB.addProduct(new Product(name, Double.parseDouble(price), description))) {
                getServletContext().setAttribute("productList", ProductDB.getProductList());
                RequestDispatcher view = request.getRequestDispatcher("/private/welcome.jsp");
                view.forward(request, response);
            } 
        }
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
