package datasample;

import org.bson.Document;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataSample {
	public DataSample() {
		
	}
	private Document documentOne = new Document();
	private Document documentTwo = new Document();
	private Document documentThree = new Document();
	
	private Document documentFive = new Document();
	private Document documentSix = new Document();
	private Document documentSeven = new Document();
	
	private Document documentEight = new Document();
	private Document documentNine = new Document();
	private Document documentTen = new Document();
	
	public Document[] dataOperation() {
		documentOne.put("name", "AlphaZero");
		documentTwo.put("name", "Alpha1");
		documentThree.put("name", "Alpha2");
		
		documentFive.put("name", "Alpha3");
		documentSix.put("name", "Alpha4");
		documentSeven.put("name", "Alpha5");
		
		documentEight.put("name", "Alpha");
		documentNine.put("name", "Alpha");
		documentTen.put("name", "Alpha");
		Document[] documentArray = {documentOne, documentTwo, documentThree, documentFive,
				documentSix, documentSeven, documentEight, documentNine, documentTen};
		return documentArray;
	}
	
	public ObservableList<Document> getNewDataOperation(){
		final ObservableList<Document> data = FXCollections.observableArrayList(
				documentOne, documentTwo, documentThree, documentFive,
				documentSix, documentSeven, documentEight, documentNine, documentTen
			);
		return data;
	}
	
}
