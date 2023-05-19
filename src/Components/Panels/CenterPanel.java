package Components.Panels;

import Components.Themes.Colors;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class CenterPanel extends JPanel {

    public CenterPanel(){
        FlatLightLaf.setup();
        JTabbedPane tabs = new JTabbedPane();

        this.setLayout(new GridLayout());
        this.setBackground(Colors.PRIMARY);
        this.setBorder(new MatteBorder(0,0,0,1, Colors.PRIMARY));
        this.add(tabs);
        tabs.addTab("WAW", new JPanel());
    }

}
