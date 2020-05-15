package SocketProg;



import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestServer {

    GreetClient client;

    @Before
    public void setup() throws IOException {
        client = new GreetClient();
        client.startConnection("localhost", 4444);
    }

    @After
    public void tearDown() throws IOException {
        client.stopConnection();
    }

    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws Exception {

        GreetServer.main(null);
        Thread.sleep(100000000);
        String resp1 = client.sendMessage("hello");
        assertEquals("hello", resp1);
       /* String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");


        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);*/
    }

  /*  @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("localhost", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }*/
}
