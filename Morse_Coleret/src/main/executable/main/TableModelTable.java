package main;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModelTable extends AbstractTableModel {
	DB_Query query;
	private List<List<Object>> arrayListDB;
	private List<Object> columnNames;
	public TableModelTable(DB_Query query) {
		this.query = query;
		arrayListDB = query.find();
	    columnNames = query.getColumnNamesData();
	}
	@Override
	public int getColumnCount() {
		return columnNames.size();
	}

	@Override
	public int getRowCount() {
		return arrayListDB.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return arrayListDB.get(arg0).get(arg1);
	}
	
	// override default methods ---
	
	@Override
    public void	setValueAt(Object aValue, int rowIndex, int columnIndex){
        arrayListDB.get(rowIndex).set(columnIndex, aValue);
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    public void deleteData(int rowIndex){
    	System.out.println("Unsupported Operation!");
        //arrayListDB.remove(rowIndex);
    }
	
	
	//----
    public List<List<Object>> getArrayListDB() {
		return arrayListDB;
	}
	public List<Object> getColumnNames() {
		return columnNames;
	}
}
