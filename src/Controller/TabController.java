package Controller;

import Components.Functionals.TabPane.controlledTabs;
import Interfaces.IController;

import javax.swing.*;

public class TabController implements IController {

    private static TabController controller;
    private final controlledTabs tabs = controlledTabs.getInstance();

    public static TabController getInstance(){
        if(controller == null){
            controller = new TabController();
        }
        return controller;
    }

    private TabController(){}

    public controlledTabs getTabs(){
        return tabs;
    }

}
