package Components.Panels;

import Components.Themes.Colors.Colors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CenterPanel extends JPanel {

    public CenterPanel(){
        JTabbedPane tabs = new JTabbedPane();

        this.setLayout(new GridLayout());
        this.setBorder(new EmptyBorder(5,0,0,0));
        this.setBackground(Colors.PRIMARY);
        this.setMinimumSize(new Dimension(0,0));

        this.add(tabs);
        tabs.addTab("WAW", new JPanel());
    }

}
