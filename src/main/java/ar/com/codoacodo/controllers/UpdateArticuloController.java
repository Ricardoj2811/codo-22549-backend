package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;


@WebServlet("/UpdateArticuloController")

public class UpdateArticuloController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		try {
			var articulo = dao.getByID(Long.parseLong(id));
			req.setAttribute("producto", articulo);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String img = req.getParameter("imagen");
		Float precio = Float.parseFloat(req.getParameter("precio"));
		Long id = Long.parseLong(req.getParameter("id"));
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		Articulo articulo;
		
		try {
			articulo = dao.getByID(id);
			articulo.setImg(img);
			articulo.setAutor(autor);
			articulo.setPrecio(precio);
			articulo.setTitulo(titulo);
				
			dao.update(articulo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
	}


}
