package Components;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard(){
        init();
    }

    private void init(){
        FlatLightLaf.setup();
        this.setLayout(new BorderLayout());
        this.setTitle("Product Manager");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,500));
    }

}
