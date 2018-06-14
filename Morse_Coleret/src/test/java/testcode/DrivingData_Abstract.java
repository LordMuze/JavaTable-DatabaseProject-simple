package testcode;

public abstract class DrivingData_Abstract {
	private Query_Operations_Interface operation_query;
	
	public Query_Operations_Interface getOperation_query() {
		return operation_query;
	}
	
	public void setOperation_query(Query_Operations_Interface operation_query) {
		this.operation_query = operation_query;
	}
	
}
