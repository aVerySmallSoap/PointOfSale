package Components.Functionals.Table.Models;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class singleSelectionModel extends DefaultListSelectionModel implements ListSelectionListener {

    public singleSelectionModel(){
        this.addListSelectionListener(this);
        this.setSelectionMode(SINGLE_SELECTION);
    }



    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
