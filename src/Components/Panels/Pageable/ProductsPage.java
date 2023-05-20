package Components.Panels.Pageable;


import javax.swing.*;

public class ProductsPage extends JPanel {

    private static ProductsPage instance;

    public static ProductsPage getInstance(){
        if(instance == null){
            instance = new ProductsPage();
        }
        return instance;
    }

    private ProductsPage(){
        this.setName("Products");
    }

}
