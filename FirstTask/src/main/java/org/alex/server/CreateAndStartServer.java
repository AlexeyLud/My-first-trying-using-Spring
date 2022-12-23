package org.alex.server;

import com.sun.net.httpserver.HttpServer;
import org.alex.service.CaseInvertorService;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class CreateAndStartServer {

    public static void createStartServer(String input_str) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(2341),0);
        server.createContext("/api/echo", (exchange -> {
            String out_str = CaseInvertorService.changeRegister(input_str);
            System.out.println("out = " + out_str);
            exchange.sendResponseHeaders(200, out_str.getBytes().length);
            OutputStream output = exchange.getResponseBody();
            output.write(out_str.getBytes());
            output.flush();
            exchange.close();
        }));
        server.setExecutor(null);
        server.start();
        System.out.println("Server start succesfull");
    }

}
