package Components.Panels;

import Components.Functionals.Buttons.ProductsList;
import Components.Themes.Colors.Colors;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class NavigationPanel extends JPanel {

    public NavigationPanel(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        this.setBorder(new MatteBorder(0,0,0,2, Colors.ACCENT));
        this.setBackground(Colors.PRIMARY);

        constraints.anchor = GridBagConstraints.PAGE_START;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.insets = new Insets(5,5,5,5);
        this.add(new ProductsList(), constraints);
    }
}
