package Components;

import Components.Panels.CenterPanel;
import Components.Panels.ReceiptPanel;
import Components.Themes.Colors;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame implements Runnable {

    private void init(){
        FlatLightLaf.setup();
        CenterPanel centerPanel = new CenterPanel();
        ReceiptPanel receiptPanel = new ReceiptPanel();
        JSplitPane pane = new JSplitPane();
        JSplitPane pane2 = new JSplitPane();

        this.setLayout(new BorderLayout());
        this.setTitle("Product Manager");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,500));


        pane.setLeftComponent(centerPanel);
        pane2.setLeftComponent(null);
        pane2.setRightComponent(receiptPanel);
        pane.setRightComponent(pane2);
        pane.setResizeWeight(0.5);

        this.add(pane, BorderLayout.CENTER);
//        this.add(receiptPanel, BorderLayout.EAST);
        this.setVisible(true);
    }

    @Override
    public void run() {
        init();
    }
}
