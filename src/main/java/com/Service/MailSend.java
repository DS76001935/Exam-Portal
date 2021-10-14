package com.Service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;


@Service
public class MailSend {
	
	static String from = "shah.deep095@gmail.com";
	
	public static Session configuration(Session session){
	      // Recipient's email ID needs to be mentioned.
	      // Sender's email ID needs to be mentioned
	      final String username = "shah.deep095@gmail.com";//change accordingly
	      final String password = "shah30568890";//change accordingly

	      Properties props = new Properties();
	      props.put("mail.smtp.user","username"); 
	      props.put("mail.smtp.host", "smtp.gmail.com"); 
	      props.put("mail.smtp.port", "587"); 
	      props.put("mail.debug", "true"); 
	      props.put("mail.smtp.auth", "true"); 
	      props.put("mail.smtp.starttls.enable","true"); 
	      props.put("mail.smtp.EnableSSL.enable","true");

	      props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
	      props.setProperty("mail.smtp.socketFactory.fallback", "false");   
	      props.setProperty("mail.smtp.port", "465");   
	      props.setProperty("mail.smtp.socketFactory.port", "465"); 

	      session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
	            }
	      });
	      System.out.println("Session object while sending a mail => "+session);
	      return session;
	}
	public static void mail (String email,String subject, String text) {
		
		Session session = null;
		session = MailSend.configuration(session);
		
			try {
			   // Create a default MimeMessage object.
			   Message message = new MimeMessage(session);
			
			   // Set From: header field of the header.
			   message.setFrom(new InternetAddress(from));
			
			   // Set To: header field of the header.
			   message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			
			   // Set Subject: header field
			   message.setSubject(subject);
			
			   // Now set the actual message
			   message.setText(text);

			   // Send message
			   Transport.send(message);

			   System.out.println("Sent message successfully....");

		      } catch (MessagingException e) {
		         throw new RuntimeException(e);
		      }
	}
}

