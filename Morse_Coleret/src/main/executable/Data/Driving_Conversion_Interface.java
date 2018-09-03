package Data;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public interface Driving_Conversion_Interface {
	public List<List<Object>> convertGetData(FindIterable<Document> iterable);
	static final List<List<Object>> listData = new ArrayList<List<Object>>();
	static final List<Object> columnData = new ArrayList<Object>();
	public List<Object> getArrayColumn();
	default List<Object> getColumnData(Document doc) {
		for(String key: doc.keySet()) {
			columnData.add(key);
		}
		return columnData;
	}
	static void refreshData() {
		listData.clear();
		columnData.clear();
	}
}
