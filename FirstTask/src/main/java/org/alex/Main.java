package org.alex;

import java.io.*;
import org.alex.input.InputStringChecking;
import org.alex.server.CreateAndStartServer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String str = InputStringChecking.inputString();
        CreateAndStartServer.createStartServer(str);
    }
}