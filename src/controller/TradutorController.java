package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Tradutor;

/**
 * Servlet implementation class tradutorController
 */
@WebServlet("/tradutorController")
public class TradutorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TradutorController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String palavra = request.getParameter("palavra");
		String modo = request.getParameter("modo");
		Tradutor tradutor = new Tradutor(palavra, modo);
		String traducao = tradutor.getTraducao();
		request.getSession().setAttribute("palavra", palavra);
		request.getSession().setAttribute("traducao", traducao);
		request.getSession().setAttribute("modo", modo);
		request.getRequestDispatcher("tradutor.jsp").forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
