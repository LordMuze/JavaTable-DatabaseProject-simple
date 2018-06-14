package testcode;

public class Collection_Operation extends Collection_Abstract {
	public Collection_Operation(Mongo_Singleton database) {
		super(database);
	}
	public Collection_Operation() {
		super();
	}
		@Override
	    protected boolean addCollection(String collection) {
		if(counter < 10) {
			if(!scanCollectionSameName(collection)) {
			collectionsArray[counter] = collection;
			counter++;
			return true;
			}
		}
		return false;
	}
	
	
}
