package Components.Panels;

import Components.Functionals.TabPane.controlledTabs;
import Components.Themes.Colors.Colors;
import Controller.TabController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CenterPanel extends JPanel {

    private TabController controller;
    private final controlledTabs tabs = controlledTabs.getInstance();

    public CenterPanel(TabController controller){
        this.controller = controller;
        init();
    }

    private void init(){
        this.setLayout(new GridLayout());
        this.setBorder(new EmptyBorder(5,0,0,0));
        this.setBackground(Colors.PRIMARY);
        this.setMinimumSize(new Dimension(0,0));

        this.add(tabs);
    }

}
