package collection_manage;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import main.*;
public abstract class Collection_Abstract {
	//Calling Operations class
	protected String[] collectionsArray = {"Lirque", "Bane", "TestCollection"};
	private MongoDatabase database;
	/*
	 Testing purposes only here^
	 */
	
    protected int counter = 0;
    public Collection_Abstract(Mongo_Singleton database) {
		this.database = database.getSetDatabase(0);
	}
    public Collection_Abstract() {
    	//Operations excluding database
    }

	protected abstract boolean addCollection(String collection);
    public void addCollectionDB(String collection) {
    	if(addCollection(collection)) {
    		database.createCollection(collection);
    	}
    }
	public boolean scanCollectionSameName(String collectionName) {
		boolean existingCollection = false;
		for(int i = 0; i < collectionsArray.length; i++) {
			if(collectionsArray[i] != null) {
			existingCollection = collectionsArray[i].equals(collectionName);
			if(existingCollection) {
				break;
			}
			}
		}
		return existingCollection;
	}
	private boolean removeCollection(int collection, String collectionName) {
		if(collection < collectionsArray.length || !collectionName.isEmpty()) {
		for(int i = 0; i < collectionsArray.length; i++) {
			if(i == collection || collectionsArray[i].equals(collectionName)) {
				for(int j = i; j < collectionsArray.length - 1; j++) {
					collectionsArray[j] = collectionsArray[j+1];
				}
				collectionsArray[collectionsArray.length - 1] = null;
				return true;
			}
		}
		}
		return false;
	}
	public boolean removeCollection(String collectionName) {
		database.getCollection(collectionName).drop();
		return removeCollection(-500, collectionName); /* to invalidate integer
		parameters*/
	}
	public boolean removeCollection(int collection) {
		database.getCollection(collectionsArray[collection]).drop();
		return removeCollection(collection, "");
		//to invalidate string parameters
	}
	//Collection *Tags*; Not the actual cake!
	@SuppressWarnings("rawtypes")
	public MongoCollection getCollection(int collection) {
		return database.getCollection(collectionsArray[collection]);
	}
	@SuppressWarnings("rawtypes")
	public MongoCollection getCollection(String name) {
		if(!scanCollectionSameName(name)) {
			System.out.println("No collection!!");
			return null;
		}
		System.out.println("Mongo Data Collection");
		return database.getCollection(name);
	}
	
}
