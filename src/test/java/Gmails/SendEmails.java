package Gmails;

import org.apache.commons.mail.SimpleEmail;

public class SendEmails {


       /*
            first Step:
                go to  :
                     https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web

                        Make sure that your google account allows third part app
         */

    public static void main(String[] args) {
        String userName = "Cybertek.Batch@gmail.com",
                passWord = "Batch12BestBatch",
                Receiver = "Cybertek.Batch@gmail.com",
                MSG ="Testing email",
                Subject ="Generating Gmails";


        sendEmails(userName,passWord,Receiver,MSG,Subject);

        System.out.println("Send successfully");


    }


    public static void sendEmails(String username, String password, String Receiver, String MSG, String Subject){

        SimpleEmail email=new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(username, password);
        email.setSSLOnConnect(true);
        email.setSubject(Subject);


        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.addTo(Receiver);
            email.send();
            Thread.sleep(3000);
        } catch (Exception e) {   }


    }


}
