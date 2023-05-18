package Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionControllerTest {

    ConnectionController connection;

    @Test
    void getConnection() {
        connection = new ConnectionController("point_sale", "root", "root");
        assertDoesNotThrow(() ->connection.getConnection());
    }

    @Test
    void nullConnection(){
        connection = new ConnectionController(null, null, null);
        assertNull(connection.getConnection());
    }
}