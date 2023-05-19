package Components.Panels;

import Components.Themes.Colors.Colors;
import Components.Themes.SplitTheme;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class CenterPanel extends JPanel {

    public CenterPanel(){
        JTabbedPane tabs = new JTabbedPane();

        this.setLayout(new GridLayout());
        this.setBackground(Colors.PRIMARY);
        this.setBorder(new MatteBorder(0,0,0,1, Colors.PRIMARY));
        this.add(tabs);
        tabs.addTab("WAW", new JPanel());
        this.setMinimumSize(new Dimension(0,0));
    }

}
