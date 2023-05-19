package Components;

import Components.Panels.CenterPanel;
import Components.Themes.Colors;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame implements Runnable {

    private void init(){
        FlatLightLaf.setup();
        CenterPanel panel = new CenterPanel();
        JPanel panel2 = new JPanel();

        this.setLayout(new BorderLayout());
        this.setTitle("Product Manager");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,500));

        this.add(panel, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.EAST);
        this.setVisible(true);
    }

    @Override
    public void run() {
        init();
    }
}
