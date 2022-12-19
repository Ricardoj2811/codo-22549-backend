package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/SearchArticulosController")
public class SearchArticulosController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String claveBusqueda = req.getParameter("claveBusqueda");
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		List<Articulo> articulosBuscado = new ArrayList<>();		
		try {
			articulosBuscado = dao.search(claveBusqueda);

		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		req.setAttribute("productos", articulosBuscado);
		
		getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
	}
}
