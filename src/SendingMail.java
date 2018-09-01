

import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.mail.smtp.SMTPMessage;

/**
 * Servlet implementation class SendingMail
 */
@WebServlet("/SendingMail")
public class SendingMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String Name,Designation,Company,Email;
	static String Mobile;
    /**
     * Default constructor. 
     */
    public SendingMail() {
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
		doGet(request, response);
		
		
		Name = request.getParameter("name");
		Designation = request.getParameter("designation");
		Company = request.getParameter("company");
		Email = request.getParameter("email");
		Mobile = request.getParameter("mobile");
		
		System.out.println(Name+"\n"+Company+"\n"+Designation+Email);
				
		response.getWriter().write("1");

/*		    Mail mail = new Mail();
			try {
				mail.send("vinay@exafluence.com", "munikumari@exafluence.com", "First Demo", Name+"\n"+Designation+"\n"+Company+"\n"+Email+"\n"+Mobile);
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/


   
		
	}

}
