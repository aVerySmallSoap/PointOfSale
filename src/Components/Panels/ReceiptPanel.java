package Components.Panels;

import Components.Functionals.Table.ReceiptTable;
import Controller.ConnectionController;

import javax.swing.*;
import java.awt.*;

public class ReceiptPanel extends JPanel {

    public ReceiptPanel(){
        ReceiptTable table = new ReceiptTable(new ConnectionController("point_sale","root","root"));
        JScrollPane scrollPane = new JScrollPane(table);

        this.setLayout(new GridLayout());
        this.add(scrollPane);
        this.setMinimumSize(new Dimension(200,0));
    }

}
