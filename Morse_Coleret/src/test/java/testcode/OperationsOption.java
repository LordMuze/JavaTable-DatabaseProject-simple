package testcode;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

public class OperationsOption {
	private Collection_Abstract collectionOp;
	private Sub_Query_Operation_Delete delete;
	private Sub_Query_OperationFind find;
	private Sub_Query_OperationInsert insert;
	private Sub_Query_OperationUpdate updateData;
	
	public OperationsOption(Collection_Abstract collec) {
		this.collectionOp = collec;
	}
	public FindIterable<Document> find(Bson filter){
		find.setCollection(collectionOp.getCollection(0));
		return find.queryGetData(filter);
	}
	public DeleteResult delete(Bson filter) {
		find.setCollection(collectionOp.getCollection(0));
		return delete.delete(filter);
	}
	public void insert(Document[] documentArray) {
		find.setCollection(collectionOp.getCollection(0));
		insert.setData(documentArray);
		insert.insert();
	}
	public UpdateResult update(Bson filter, Bson update) {
		find.setCollection(collectionOp.getCollection(0));
		return updateData.update(filter, update);
	}
}
