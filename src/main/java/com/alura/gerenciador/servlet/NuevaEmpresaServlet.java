package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreEmpresa = request.getParameter("nombre");
		
		Empresa empresa = new Empresa();
		
		empresa.setNombre(nombreEmpresa);
		
		DB baseDeDatos = new DB();
		baseDeDatos.agregarEmpresa(empresa);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>Empresa " + nombreEmpresa + " registrada</html></body>");
		
	}

}
