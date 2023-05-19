package Components.Panels;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class NavigationPanel extends JPanel {

    public NavigationPanel(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        this.setBorder(new EmptyBorder(0,0,0,2));

        constraints.anchor = GridBagConstraints.PAGE_START;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.insets = new Insets(5,5,5,5);
        this.add(new JButton("AA"), constraints);
    }
}
