package testcode;

import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public interface Driving_Conversion_Interface {
	public List<List<Object>> convertGetData(FindIterable<Document> iterable);
}
