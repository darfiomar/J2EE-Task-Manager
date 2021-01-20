package com.xsoft.controllers.servlets;

import java.io.IOException;
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
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
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
			
			ProjetDAOImpl p = new ProjetDAOImpl();
			try {
				List<Projet> projets=p.queryProjet(null, "Code DESC");
				session.setAttribute("nprojets", projets.size());
				request.setAttribute("projets", projets);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			TacheDAOImpl t = new TacheDAOImpl();
			try {
				List<Tache> taches=t.queryTache(null, "Numero DESC");
				session.setAttribute("ntaches", taches.size());
				request.setAttribute("taches", taches);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			UtilisateurDAOImpl u = new UtilisateurDAOImpl();
			try {
				List<Utilisateur> utilisateurs=u.queryUtilisateur(null, "Numero DESC");
				session.setAttribute("nusers", utilisateurs.size());
				request.setAttribute("users", utilisateurs);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(!(request.getParameter("p")==null)) {
				String pg= request.getParameter("p");
				int code = Integer.parseInt(pg);
				Projet projet = null;
				try {
					projet = p.getProjetByORMID(code);
				} catch (PersistentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(!(projet==null)) {
					request.setAttribute("intitule", "du projet : "+projet.getIntitule());
					request.setAttribute("taches", projet.getORM_Tasks());
				}
			}
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(request, response);
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
