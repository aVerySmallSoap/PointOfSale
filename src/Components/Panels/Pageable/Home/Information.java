package Components.Panels.Pageable.Home;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Information extends JPanel {

    public Information(){
        JLabel customerName = new JLabel("Name here");
        this.setLayout(new BorderLayout());

        customerName.setBorder(new EmptyBorder(0,25,0,0));
        customerName.setFont(new Font("Segoe UI",Font.PLAIN,24));
        this.add(customerName, BorderLayout.NORTH);
    }

}
