package Components.Functionals.Table;

import Components.Functionals.Table.Models.localTableModel;
import Components.Functionals.Table.Models.singleSelectionModel;
import Controller.TableController;
import Interfaces.IConnector;

import javax.swing.*;

public class ReceiptTable extends JTable {

    private final IConnector connector;

    public ReceiptTable(IConnector connector){
        this.connector = connector;
        init();
    }

    private void init(){
        this.setModel(new localTableModel(new TableController(), this));
        this.setSelectionModel(new singleSelectionModel());
    }

    public IConnector getConnector(){
        return connector;
    }

}
