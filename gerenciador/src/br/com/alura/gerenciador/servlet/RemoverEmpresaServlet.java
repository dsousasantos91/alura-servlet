package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removerEmpresa")
public class RemoverEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RemoverEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String parameterId = request.getParameter("id");
		Integer id = Integer.valueOf(parameterId);
		
		Banco banco = new Banco();
		banco.removerEmpresa(id);
		
		response.sendRedirect("listaEmpresas");
	
	}

}
