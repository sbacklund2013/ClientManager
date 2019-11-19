package com.business;

import com.model.Client;
import com.sun.mail.smtp.SMTPTransport;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class EmailService {
	
 	private static final String SMTP_SERVER = "Smtp.gmail.com";
    private static final String USERNAME = "NMTSA.donotreply@gmail.com";
    private static final String PASSWORD = "Suzanne54321!";

    private static final String EMAIL_FROM = "NMTSA.donotreply@gmail.com";
    private static final String EMAIL_TO = "";
    private static final String EMAIL_TO_CC = "";

    private static final String EMAIL_SUBJECT = "Registration Successful";
    private static String EMAIL_TEXT = "";


public boolean sendEmail(Client c)
{
	String email=c.getEmail();
	EMAIL_TEXT = "Hello " + c.getFirstName() + " " + c.getLastName() + ", "+ "Thank you for registering for NMTSA!\nYour information has been successfully added.\n\n\nNeurologic Music Therapy Services of Arizona\n2702 N 3rd Street, Suite 1000\nPhoenix, AZ 85004\ninfo@nmtsa.org\nPhone  |  (602) 840-6410\nFax  |  (602) 840-6431";
	Properties prop = System.getProperties();
	prop.put("mail.smtp.starttls.enable", "true");
    prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
    prop.put("mail.smtp.auth", "true");
    prop.put("mail.smtp.port", "25"); // default port 25

    Session session = Session.getInstance(prop, null);
    Message msg = new MimeMessage(session);

    try {
	
		// from
        msg.setFrom(new InternetAddress(EMAIL_FROM));

		// to 
        msg.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(email, false));

		// cc
        msg.setRecipients(Message.RecipientType.CC,
                InternetAddress.parse(EMAIL_TO_CC, false));

		// subject
        msg.setSubject(EMAIL_SUBJECT);
		
		// content 
        msg.setText(EMAIL_TEXT);
		
        msg.setSentDate(new Date());

		// Get SMTPTransport
        SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
		
		// connect
        t.connect(SMTP_SERVER, USERNAME, PASSWORD);
		
		// send
        t.sendMessage(msg, msg.getAllRecipients());

        System.out.println("Response: " + t.getLastServerResponse());

        t.close();

    } catch (MessagingException e) {
        e.printStackTrace();
    }
    return true;

}
	
}
