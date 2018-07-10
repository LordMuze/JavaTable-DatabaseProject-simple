package testcode;

import org.bson.Document;

public interface Sub_Query_OperationInsert extends Query_Operations {
	public void insert();
	public void setData(Document[] array);
}
