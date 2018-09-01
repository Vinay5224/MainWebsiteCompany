

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendMail
 */
@WebServlet("/SendMail")
public class SendMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String Name,Designation,Company,Email;
	static String Mobile;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
			Name = request.getParameter("name");
			Designation = request.getParameter("designation");
			Company = request.getParameter("company");
			Email = request.getParameter("email");
			Mobile = request.getParameter("mobile"); 
			System.out.println(Name+"\n"+Designation+"\n"+Company+"\n"+Email+"\n"+Mobile);
		          
		    Mailer.send("munikumari@exafluence.com", "First Demo", Name+"\n"+Designation+"\n"+Company+"\n"+Email+"\n"+Mobile); 
		    out.print("message has been sent successfully");  
		    out.close(); 
		    response.getWriter().write("1");
		
 
	}

}
