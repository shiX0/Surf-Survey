package conformationmessage.javaamail;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.passwordAuthentication;
import javax.mail.Session;

public class conformationmessage {
    
    public static void sendmail(String recepient) {
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "subhashmahato5268@gmail.com";
        String password = "65246985";
        Session session = Session.getInstance(properties, new Authenticator() {
           protected passwordAuthentication getPasswordAuthentication() {
            return new passwordAuthentication(myAccountEmail,password);
            
       }
        
    });
        
   Message message = prepareMessage(session , myAccountEmail, recepient);
   
    Transport.send(message):
    System.out.println("message sent successfully");
   
}
    private static message preparemessage(Session session, String myAccountEmail, String recept){
    try{
        Message message = new mineMessage(session);
        message.setfrom(new InternetAddress (myAccountEmail));
        message.setRecipient(message.RecipientType.to, new InternetAddress(recepient));
        message.setSubject("My First Email from java App");
        message.setText("Hey There, \n Look my email!");
        return message;
        
   }
    catch (Exception ex){
        Logger.getLOgger(conformationmessage.class.getName()). log(Level.SEVERE, null, ex);
        
    }
    return null;
    
    }
            
    
}
