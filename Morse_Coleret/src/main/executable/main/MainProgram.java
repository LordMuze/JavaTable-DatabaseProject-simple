package main;
import java.util.List;
import Query_Operation.*;
import collection_manage.*;
import datasample.*;
public class MainProgram {

	public static void main(String[] args) {
		Mongo_Singleton single = new Mongo_Singleton();
		single.mongoURI();
		Collection_Abstract collectionManager = new Collection_Operation(single);
		DB_Query queryDB = new DB_Query(collectionManager);
		TableModelTable tableModel = new TableModelTable(queryDB);
		List<List<Object>> listData = tableModel.getArrayListDB();
				//queryDB.find();
		List<Object> columnData = tableModel.getColumnNames();
				//queryDB.getColumnNamesData();
		for(int i = 0; i < listData.size(); i++) {
				System.out.println(listData.get(i).get(0));
		}
		for(int i = 0; i < columnData.size(); i++) {
			System.out.println(columnData.get(i));
		}
		DataSample sampleData = new DataSample();
		//new InsertExecutable(collectionManager.getCollection(2)).insert(sampleData.dataOperation());
	}

}
