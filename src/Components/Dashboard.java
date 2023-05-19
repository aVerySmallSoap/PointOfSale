package Components;

import Components.Panels.CenterPanel;
import Components.Panels.NavigationPanel;
import Components.Panels.ReceiptPanel;
import Components.Themes.SplitTheme;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    private static Dashboard dashboard;

    private Dashboard(){}

    public static Dashboard getInstance(){
        if(dashboard == null){
            dashboard = new Dashboard();
        }
        return dashboard;
    }

    private void init(){
        SplitTheme.setUp();
        NavigationPanel navigationPanel = new NavigationPanel();
        CenterPanel centerPanel = new CenterPanel();
        ReceiptPanel receiptPanel = new ReceiptPanel();
        JSplitPane pane = new JSplitPane();

        this.setLayout(new BorderLayout());
        this.setTitle("Product Manager");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLocationRelativeTo(null);

        pane.setLeftComponent(centerPanel);
        pane.setRightComponent(receiptPanel);
        pane.setResizeWeight(0.5);

        this.add(navigationPanel, BorderLayout.WEST);
        this.add(pane, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void run() {
        Dashboard.getInstance().init();
    }
}
