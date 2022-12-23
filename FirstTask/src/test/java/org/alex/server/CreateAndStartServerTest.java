package org.alex.server;

import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.InetSocketAddress;

public class CreateAndStartServerTest extends CreateAndStartServer {

    @Test
    void testCreateStartServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(1112), 1);
        server.setExecutor(null);
        server.start();
    }
}