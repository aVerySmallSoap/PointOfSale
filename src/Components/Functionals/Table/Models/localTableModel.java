package Components.Functionals.Table.Models;

import Components.Functionals.Table.ReceiptTable;
import Controller.TableController;

import javax.swing.table.AbstractTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class localTableModel extends AbstractTableModel {

    TableController controller;
    ReceiptTable table;
    ResultSetMetaData metaData;
    ResultSet resultSet;
    Vector<String> columns;
    @SuppressWarnings("rawtypes")
    Vector<Vector> rows;

    public localTableModel(TableController controller, ReceiptTable table){
        try{
            try(PreparedStatement pt = table.getConnector().getConnection().prepareStatement("select * from products")){
                this.controller = controller;
                this.table = table;
                resultSet = pt.executeQuery();
                metaData = resultSet.getMetaData();
                columns = controller.getColumnNames(resultSet);
                rows = controller.getRowData(resultSet);
            }
        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        try {
            return metaData.getColumnCount();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns.get(column);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vector<Object> temp = rows.elementAt(rowIndex);
        return temp.elementAt(columnIndex);
    }
}
