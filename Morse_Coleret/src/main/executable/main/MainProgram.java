package main;
import java.util.List;

import collection_manage.*;

public class MainProgram {

	public static void main(String[] args) {
		Mongo_Singleton single = new Mongo_Singleton();
		single.mongoURI();
		Collection_Abstract collectionManager = new Collection_Operation(single);
		DB_Query queryDB = new DB_Query(collectionManager);
		TableModelTable tableModel = new TableModelTable(queryDB);
		List<List<Object>> listData = queryDB.find();
		List<Object> columnData = queryDB.getColumnNamesData();
		for(int i = 0; i < listData.size(); i++) {
				System.out.println(listData.get(i).get(0));
		}
		for(int i = 0; i < columnData.size(); i++) {
			System.out.println(columnData.get(i));
		}
	}

}
