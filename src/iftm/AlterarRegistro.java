package iftm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/alterar")
public class AlterarRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AlterarRegistro() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int chave = Integer.parseInt(request.getParameter("id"));	
		Dados contato = Banco.carregaRegistro(chave);
		PrintWriter saida = response.getWriter();
		response.setContentType("text/html");
		saida.println("<form action=alterar method=post>");
		saida.println("Nome: <input name=nome value="+ contato.getNome() + ">");
		saida.println("Telefone: <input name=telefone value=" + contato.getTelefone() + ">");
		saida.println("<input type=hidden name=chave value=" + chave + ">");
		saida.print("<input type=submit></form>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		int chave = Integer.parseInt(request.getParameter("chave"));
		Dados novo = new Dados(chave, nome, telefone);
		Banco.alteraDados(novo);
		response.sendRedirect("listar");
	}

}
