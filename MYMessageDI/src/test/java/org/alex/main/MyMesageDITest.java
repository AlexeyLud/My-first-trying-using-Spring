package org.alex.main;

import org.alex.consumer.Consumer;
import org.alex.consumer.MyApplication;
import org.alex.injector.MessageServiceInjector;
import org.alex.servise.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMesageDITest extends MyMesageDI {

    private MessageServiceInjector injector;

    @Before
    public void setUp() throws Exception {
        injector = new MessageServiceInjector() {
            @Override
            public Consumer getConsumer() {
                return new MyApplication(new MessageService() {
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock message service implementation");
                    }
                });
            }
        };
    }

    @Test
    public void test(){
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi man", "aleslyd@mail.com");
    }

    @After
    public void tearDown() throws Exception {
        injector = null;
    }
}