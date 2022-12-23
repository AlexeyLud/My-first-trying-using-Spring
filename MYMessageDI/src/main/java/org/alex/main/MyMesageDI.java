package org.alex.main;

import org.alex.consumer.Consumer;
import org.alex.injector.EmailInjector;
import org.alex.injector.MessageServiceInjector;
import org.alex.injector.SMSInjector;

public class MyMesageDI {
    public static void main(String[] args) {
        String msg = "Hi man";
        String email = "aleslyd@gmail.com";
        String phone = "+375333404145";

        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send sms
        injector = new SMSInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
