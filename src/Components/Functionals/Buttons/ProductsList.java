package Components.Functionals.Buttons;

import Components.Panels.Pageable.ProductionPage.ProductsPage;
import Controller.TabController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductsList extends JButton implements ActionListener {

    private final ProductsPage page = ProductsPage.getInstance();

    public ProductsList(){
        this.setText("Products");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TabController.getInstance().getTabs().addTab(page.getName(), page);
    }
}
