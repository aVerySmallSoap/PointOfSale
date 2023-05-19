package Components.Panels;

import javax.swing.*;
import java.awt.*;

public class ReceiptPanel extends JPanel {

    public ReceiptPanel(){
        JTable table = new JTable(5,5);
        JScrollPane scrollPane = new JScrollPane(table);

        this.setLayout(new GridLayout());
        this.add(scrollPane);
        this.setMinimumSize(new Dimension(0,0));
    }

}
