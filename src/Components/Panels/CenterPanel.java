package Components.Panels;

import Components.Themes.Colors.Colors;
import Components.Themes.SplitTheme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class CenterPanel extends JPanel {

    public CenterPanel(){
        JTabbedPane tabs = new JTabbedPane();

        this.setLayout(new GridLayout());
        this.setBorder(new EmptyBorder(5,0,0,0));
        this.add(tabs);
        tabs.addTab("WAW", new JPanel());
        this.setMinimumSize(new Dimension(0,0));
    }

}
