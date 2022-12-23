package org.alex.consumer;

public interface Consumer {
    void processMessages(String msg, String rec);
}
