import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.sun.mail.smtp.SMTPMessage;
public class Mail {
	public static void main (String args[]) throws AddressException, MessagingException{
		
		send("vinay.kambam5224@gmail.com", "munikumari@exafluence.com,vinay@exafluence.com", "First Demo","dsjhdskjlfsh");
	}


	      public static void send(String from, String to, String subject, String content)throws AddressException, MessagingException {

   String host = "smtp.gmail.com";
//String host = "smtpout.secureserver.net";
Properties props = new Properties();
props.put("mail.smtp.starttls.enable", "true"); 
props.put("mail.smtp.host", host);
props.put("mail.smtp.auth", "true");
//props.put("mail.smtp.port", "3535");
props.put("mail.smtp.port", "587"); //gmail port

Session session = Session.getInstance(props);
session.setDebug(true);

try {

SMTPMessage msg = new SMTPMessage(session);


msg.setFrom(new InternetAddress(from));
msg.setRecipients(Message.RecipientType.TO, to);
msg.setSubject(subject);

Transport tr = session.getTransport("smtp");

String username="vinay.kambam5224@gmail.com";
String password="GANGAdeena";

tr.connect(host, username, password);
msg.setContent(content,"text/html");  
msg.saveChanges();  
tr.sendMessage(msg, msg.getAllRecipients());
tr.close(); 
}
catch (Exception mex) {
System.out.println(mex);
}
		
	}

}
