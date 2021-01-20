package com.xsoft.controllers.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.orm.PersistentException;

import com.xsoft.models.Projet;
import com.xsoft.models.Tache;
import com.xsoft.models.Utilisateur;
import com.xsoft.models.impl.ProjetDAOImpl;
import com.xsoft.models.impl.TacheDAOImpl;
import com.xsoft.models.impl.UtilisateurDAOImpl;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session.getAttribute("loggedInUser")==null) {
			this.getServletContext().getRequestDispatcher("/login").forward(request, response);
		}else {
			if(request.getParameter("d")==null) {
				this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
			}else {
				String d= request.getParameter("d");
				switch(d) {
				case "u":
				{
					String srole = (String)session.getAttribute("role");
					if(srole.equals("Administrateur")) {
						if(request.getParameter("id")!=null) {
							String id = (String)request.getParameter("id");
							request.setAttribute("id", id);
							Utilisateur user = new Utilisateur();
							UtilisateurDAOImpl getuser = new UtilisateurDAOImpl();
							try {
								user = getuser.getUtilisateurByORMID(Integer.parseInt(id));
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (PersistentException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								getuser.deleteAndDissociate(user);
							} catch (PersistentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
					break;
				}
				case "p":
				{
					String srole = (String)session.getAttribute("role");
					if(srole.equals("Chef de Projets")) {
						if(request.getParameter("id")!=null && !request.getParameter("id").isEmpty()) {
							String id = (String)request.getParameter("id");
							request.setAttribute("id", id);
							Projet projet = new Projet();
							ProjetDAOImpl getprojet = new ProjetDAOImpl();
							try {
								projet = getprojet.getProjetByORMID(Integer.parseInt(id));
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (PersistentException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								getprojet.deleteAndDissociate(projet);
							} catch (PersistentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
					break;
				}
				case "t":
				{
					String srole = (String)session.getAttribute("role");
					if(srole.equals("Chef de Projets")) {
						
						if(request.getParameter("id")!=null && !request.getParameter("id").isEmpty()) {
							String id = (String)request.getParameter("id");
							request.setAttribute("id", id);
							Tache tache = new Tache();
							TacheDAOImpl gettache = new TacheDAOImpl();
							try {
								tache = gettache.getTacheByORMID(Integer.parseInt(id));
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (PersistentException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							try {
								gettache.deleteAndDissociate(tache);
							} catch (PersistentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
					}
					this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
					break;
				}
				default:
					this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
