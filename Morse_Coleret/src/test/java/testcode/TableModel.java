package testcode;

import java.util.ArrayList;
import testcode.*;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel  {
	private static final long serialVersionUID = -4230326411806744923L;
	private String dataType; // placeholder in case we need to set to different datatype
	private OperationsOption op;
	//calls the operation class to take the data
	private List<List<Object>> arrayList;
	private List<Object> columnNames;
	public TableModel(String dataType) {
		this.dataType = dataType;
		op = new OperationsOption(dataType);
		arrayList = op.find();
		columnNames = op.getColumnNamesData();
	}
	public int getColumnCount() {
		columnNames.size();
		return 0;
	}

	public int getRowCount() {
		arrayList.size();
		return 0;
	}

	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return arrayList.get(arg0).get(arg1);
	}
	@Override
    public void	setValueAt(Object aValue, int rowIndex, int columnIndex){
        arrayList.get(rowIndex).set(columnIndex, aValue);
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    public void deleteData(int rowIndex){
        arrayList.remove(rowIndex);
        
    }
    public void setOperations(OperationsOption op) {
    	this.op = op;
    }
    public void setDataType(String name) {
    	this.dataType = name;
    }
}
