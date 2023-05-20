package Controller;

import Interfaces.IConnector;
import Interfaces.IController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionController implements IConnector, IController {

    private final String schema;
    private final String user;
    private final String pass;

    public ConnectionController(String schema, String user, String pass){
        this.schema = schema;
        this.user = user;
        this.pass = pass;
    }

    @Override
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+schema.trim(), user.trim(), pass.trim());
        }catch (SQLException | NullPointerException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
