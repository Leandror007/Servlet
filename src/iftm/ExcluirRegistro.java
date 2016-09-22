package iftm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcluirRegistro
 */
@WebServlet("/excluir")
public class ExcluirRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExcluirRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("id"));
		Banco.excluir(i);
		response.sendRedirect("listar");
	}

}
