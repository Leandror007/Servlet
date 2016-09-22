package iftm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoContato
 */
@WebServlet("/novo")
public class NovoContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NovoContato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int chave = request.getIntHeader("chave");
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");	
		Dados novo = new Dados(chave,nome, telefone);
		Banco.gravaDados(novo);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String chave = request.getParameter("chave");
         String nome = request.getParameter("nome");
         String telefone = request.getParameter("telefone");
         
         
		doGet(request, response);
	}

}
