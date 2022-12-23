package org.alex.injector;

import org.alex.consumer.Consumer;
import org.alex.consumer.MyApplication;
import org.alex.servise.SMSService;

public class SMSInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer(){
        return new MyApplication(new SMSService());
    }
}
