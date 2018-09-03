package main;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Mongo_Singleton {
	private MongoClient mongoClient;
	private MongoClientURI connection;
	private MongoDatabase mongoDatabase;
	String[] databaseNames = {"test", "official", "VERON"};
	public void mongoURI() {
		connection = new MongoClientURI("mongodb://localhost:27017");
		mongoClient = new MongoClientInstantiate().getMongoInstance(connection);
		
	}
	public MongoDatabase getSetDatabase(int database) {
		mongoDatabase = mongoClient.getDatabase(databaseNames[database]);
		return mongoDatabase;
	}
	private class MongoClientInstantiate {
		private MongoClient client;
		public MongoClient getMongoInstance(MongoClientURI connection) {
			if(client == null) {
				client = new MongoClient(connection);
			}
			return client;
		}
	}
}
