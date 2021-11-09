package com.example.proyecto_2_datos;

import Main.Main1;
import tree.EncapsulationTree;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "calculadora", value = "/calculadora")
public class HelloServlet extends HttpServlet {

    public void init() {
        ;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        EncapsulationTree encapsulationTree = EncapsulationTree.getInstance();

        response.setContentType("text/html");

        String resultado = request.getParameter("operacion");

        encapsulationTree.setInfix(resultado);

        Main1 main1 = new Main1();

        PrintWriter out = response.getWriter();
        out.println("<html><body bgcolor = 'beige',text='black'><h1> Resultado </h1></body></html>");


        //Imprime resultdo
        out.println("<h2>" + encapsulationTree.getResultado() + "</h2>");
        out.println("</body></html>");

        String respuesta = encapsulationTree.getResultado();

    }


    public void destroy() {}

}
