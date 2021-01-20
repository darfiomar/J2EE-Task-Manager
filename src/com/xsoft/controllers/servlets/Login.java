package com.xsoft.controllers.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;

import com.xsoft.models.Projet;
import com.xsoft.models.Utilisateur;
import com.xsoft.models.impl.ProjetDAOImpl;
import com.xsoft.models.impl.UtilisateurDAOImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session.getAttribute("loggedInUser") != null) {
			this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		UtilisateurDAOImpl getuser = new UtilisateurDAOImpl();
		Utilisateur user = null;
		try {
			user = getuser.loadUtilisateurByQuery("Email = '"+email+"' AND Motdepasse = '"+pass+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result= null;
		HttpSession session = request.getSession();
		if(user!=null) {
			session.setAttribute("loggedInUser", true);
			session.setAttribute("numero", user.getNumero());
			session.setAttribute("nom", user.getNom());
			session.setAttribute("prenom", user.getPrenom());
			session.setAttribute("email", user.getEmail());
			session.setAttribute("role", user.getRole());
			
		}else {result = "Invalid IDs!";request.setAttribute("result", result);}
		doGet(request, response);
	}

}
