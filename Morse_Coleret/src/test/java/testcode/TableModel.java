package testcode;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel  {
	private static final long serialVersionUID = -4230326411806744923L;
	
	
	//calls the operation class to take the data
	List<List<Object>> arrayList;
	List<String> columnNames;
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
	
	public void createData(){
        arrayList.add(new ArrayList<Object>(columnNames.size()));
        fireTableRowsInserted(arrayList.size() - 1, arrayList.size() - 1);
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    public void deleteData(int rowIndex){
        arrayList.remove(rowIndex);
        
    }

}
