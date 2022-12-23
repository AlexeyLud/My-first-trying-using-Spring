package org.alex.injector;

import org.alex.consumer.Consumer;
import org.alex.consumer.MyApplication;
import org.alex.servise.EmailService;

public class EmailInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer(){
        return new MyApplication(new EmailService());
    }
}
