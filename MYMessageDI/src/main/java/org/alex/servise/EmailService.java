package org.alex.servise;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg, String rec){
        System.out.println("Email send to " + rec + " with message " + msg);
    }
}
