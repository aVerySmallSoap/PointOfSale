package Components.Functionals.TabPane;

import javax.swing.*;

public class controlledTabs extends JTabbedPane {

    private static controlledTabs tabs;

    private controlledTabs(){}

    public static controlledTabs getInstance(){
        if(tabs == null){
            tabs = new controlledTabs();
        }
        return tabs;
    }
}
