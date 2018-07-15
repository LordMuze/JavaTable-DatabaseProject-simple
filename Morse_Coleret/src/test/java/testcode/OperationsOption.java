package testcode;

import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import designmod.ConverterFactory;

public class OperationsOption {
	private Collection_Abstract collectionOp;
	private Sub_Query_Operation_Delete delete;
	private Sub_Query_OperationFind find;
	private Sub_Query_OperationInsert insert;
	private Sub_Query_OperationUpdate updateData;
	private ConverterFactory converters;
	private MongoCollection<Document> collection;
	public OperationsOption(String dataType) {
		converters = new ConverterFactory(dataType);
		collectionOp = new Collection_Operation();
	}
	
	
	
	public OperationsOption(Collection_Abstract collec) {
		this.collectionOp = collec;
	}
	public List<List<Object>> find(Bson filter){
		find.setCollection(collectionOp.getCollection(0));
		return converters.getDataConverterFactory().convertGetData(find.queryGetData(filter));
	}
	public List<List<Object>> find(){
		find.setCollection(collectionOp.getCollection(0));
		return converters.getDataConverterFactory().convertGetData(find.queryGetData());
	}
	public DeleteResult delete(Bson filter) {
		delete.setCollection(collectionOp.getCollection(0));
		return delete.delete(filter);
	}
	public void insert(Document[] documentArray) {
		insert.setCollection(collectionOp.getCollection(0));
		insert.setData(documentArray);
		insert.insert();
	}
	public UpdateResult update(Bson filter, Bson update) {
		updateData.setCollection(collectionOp.getCollection(0));
		return updateData.update(filter, update);
	}
	
	public void setDataType(String name) {
		converters = new ConverterFactory(name);
	}
	public List<Object> getColumnNamesData() {
		return converters.getDataConverterFactory().getArrayColumn();
	}
}
