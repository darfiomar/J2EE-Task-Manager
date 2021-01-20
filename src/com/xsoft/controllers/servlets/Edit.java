package com.xsoft.controllers.servlets;

import java.io.IOException;
import java.text.ParseException;
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
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Edit() {
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
			if(request.getParameter("e")==null) {
				this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
			}else {
				String e= request.getParameter("e");
				switch(e) {
				case "profile":
				{
					request.setAttribute("e", e);
					this.getServletContext().getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(request, response);
					break;
				}
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
							if(user!=null) {
								request.setAttribute("unom", user.getNom());
								request.setAttribute("uprenom", user.getPrenom());
								request.setAttribute("uemail", user.getEmail());
								request.setAttribute("urole", user.getRole());
							}
						}
						request.setAttribute("e", e);
						this.getServletContext().getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(request, response);
					}else {
						this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
					}
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
							if(projet!=null) {
								request.setAttribute("intitule", projet.getIntitule());
								request.setAttribute("pdescription", projet.getDescription());
								request.setAttribute("pstatut", projet.getStatut());
								request.setAttribute("pcharge", projet.getChargehoraire());
							}
						}
						request.setAttribute("e", e);
						this.getServletContext().getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(request, response);
					}else {
						this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
					}
					break;
				}
				case "t":
				{
					String srole = (String)session.getAttribute("role");
					if(srole.equals("Chef de Projets") || srole.equals("Employe")) {
						ProjetDAOImpl p = new ProjetDAOImpl();
						try {
							List<Projet> projets=p.queryProjet(null, "Code DESC");
							request.setAttribute("projets", projets);
						} catch (PersistentException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						UtilisateurDAOImpl u = new UtilisateurDAOImpl();
						try {
							List<Utilisateur> utilisateurs=u.queryUtilisateur("Role = 'Employe'", "Numero DESC");
							request.setAttribute("users", utilisateurs);
						} catch (PersistentException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
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
							if(tache!=null) {
								request.setAttribute("tdescription", tache.getDescription());
								request.setAttribute("duree", tache.getDuree());
								request.setAttribute("temploye", (tache.getUser()!=null)?tache.getUser().getEmail():"");
								request.setAttribute("tprojet", (tache.getProject()!=null)?tache.getProject().getIntitule():"");
								request.setAttribute("tstatut", tache.getStatut());
								SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");  
							    String strDatedebut = formatter.format(tache.getDatedebut());  
							    String strDatefin = formatter.format(tache.getDatefin());  
								request.setAttribute("datedebut", strDatedebut);
								request.setAttribute("datefin", strDatefin);
							}
						}
						request.setAttribute("e", e);
						this.getServletContext().getRequestDispatcher("/WEB-INF/views/edit.jsp").forward(request, response);
					}else {
						this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
					}
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
		//doGet(request, response);
		HttpSession session = request.getSession();
		if(session.getAttribute("loggedInUser")==null) {
			this.getServletContext().getRequestDispatcher("/login").forward(request, response);
		}else {
			if(request.getParameter("s")==null) {
				this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
			}else {
				String s= request.getParameter("s");
				switch(s) {
				case "profile":
				{
					String nom = request.getParameter("nom");
					String prenom = request.getParameter("prenom");
					String email = request.getParameter("email");
					String pass = request.getParameter("password");
					Utilisateur user = new Utilisateur();
					UtilisateurDAOImpl getuser = new UtilisateurDAOImpl();
					try {
						user = getuser.getUtilisateurByORMID((int)session.getAttribute("numero"));
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					user.setNom(nom);
					user.setPrenom(prenom);
					user.setEmail(email);
					user.setMotdepasse(pass);
					try {
						getuser.save(user);
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					session.setAttribute("numero", user.getNumero());
					session.setAttribute("nom", user.getNom());
					session.setAttribute("prenom", user.getPrenom());
					session.setAttribute("email", user.getEmail());
					this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
					break;
				}
				case "u":
				{	
					String srole = (String)session.getAttribute("role");
					if(srole.equals("Administrateur")) {
						String nom = request.getParameter("unom");
						String prenom = request.getParameter("uprenom");
						String email = request.getParameter("uemail");
						String pass = request.getParameter("upassword");
						String role = request.getParameter("urole");
						UtilisateurDAOImpl getuser = new UtilisateurDAOImpl();
						Utilisateur user = getuser.createUtilisateur();
						if(request.getParameter("id")!=null && !request.getParameter("id").isEmpty()) {
							String id = (String)request.getParameter("id");
							try {
								user = getuser.getUtilisateurByORMID(Integer.parseInt(id));
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (PersistentException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						user.setNom(nom);
						user.setPrenom(prenom);
						user.setEmail(email);
						user.setMotdepasse(pass);
						user.setRole(role);
						try {
							getuser.save(user);
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						user = null;
						this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
						break;
					}
				}
				case "p":
				{
					String srole = (String)session.getAttribute("role");
					if(srole.equals("Chef de Projets")) {
						String intitule = request.getParameter("intitule");
						String desc = request.getParameter("pdescription");
						String status = request.getParameter("pstatut");
						String charge = request.getParameter("pcharge");
						ProjetDAOImpl getprojet = new ProjetDAOImpl();
						Projet projet = getprojet.createProjet();
						if(request.getParameter("id")!=null && !request.getParameter("id").isEmpty()) {
							String id = (String)request.getParameter("id");
							try {
								projet = getprojet.getProjetByORMID(Integer.parseInt(id));
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (PersistentException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						projet.setIntitule(intitule);
						projet.setDescription(desc);
						projet.setStatut(status);
						projet.setChargehoraire(Integer.parseInt(charge));
						try {
							getprojet.save(projet);
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						projet = null;
						this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
						break;
					}
				}
				case "t":
				{
					String srole = (String)session.getAttribute("role");
					if(srole.equals("Chef de Projets") || srole.equals("Employe")) {
						String desc = request.getParameter("tdescription");
						String duree = request.getParameter("duree");
						String employe = request.getParameter("temploye");
						String intitule = request.getParameter("tprojet");
						String statut = request.getParameter("tstatut");
						String datedebut = request.getParameter("datedebut");
						String datefin = request.getParameter("datefin");
						UtilisateurDAOImpl getuser = new UtilisateurDAOImpl();
						Utilisateur user = null;
						try {
							user = getuser.loadUtilisateurByQuery("Email = '"+employe+"'", "Numero DESC");
						} catch (PersistentException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						ProjetDAOImpl getprojet = new ProjetDAOImpl();
						Projet projet = null;
						try {
							projet = getprojet.loadProjetByQuery("Intitule = '"+intitule+"'", "Code DESC");
						} catch (PersistentException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						TacheDAOImpl gettache = new TacheDAOImpl();
						Tache tache = gettache.createTache();
						if(request.getParameter("id")!=null && !request.getParameter("id").isEmpty()) {
							String id = (String)request.getParameter("id");
							try {
								tache = gettache.getTacheByORMID(Integer.parseInt(id));
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (PersistentException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if(srole.equals("Chef de Projets")) {
							tache.setDescription(desc);
							tache.setDuree(Integer.parseInt(duree));
							tache.setUser(user);
							tache.setProject(projet);
						}
						tache.setStatut(statut);
						//System.out.println(datedebut);
						try {
							tache.setDatedebut(new SimpleDateFormat("yyyy-mm-dd").parse(datedebut));
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							tache.setDatefin(new SimpleDateFormat("yyyy-mm-dd").parse(datefin));
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							gettache.save(tache);
						} catch (PersistentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						user = null;
						this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
						break;
					}
				}// code block
				break;
				default:
					this.getServletContext().getRequestDispatcher("/dashboard").forward(request, response);
				}
			}
		}
	}

}
