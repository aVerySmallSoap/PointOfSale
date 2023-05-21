package Components.Panels.Pageable.Home;


import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {

    private static Home instance;

    public static Home getInstance(){
        if(instance == null){
            instance = new Home();
        }
        return instance;
    }

    private Home(){
        Information shelf = new Information();

        this.setName("Home");
        this.setLayout(new BorderLayout());

        this.add(shelf, BorderLayout.CENTER);
    }

}
