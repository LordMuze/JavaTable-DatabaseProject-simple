package databasetestStubs;
import org.bson.Document;
public class InsertStubs {
	Document document = new Document();
	Document docTwo = new Document();
	Document docThree = new Document();
	Document docFour = new Document();
	Document docFive = new Document();
	public void insertingData() {
		document.put("name", "Serbesius");
		document.put("age", 41);
		docTwo.put("name", "Asterisk");
		docThree.put("name", "Grazing");
		docFour.put("name", "ENFJ");
		docFive.put("name", "ENFP");
	}
	Document[] documentArray = {document, docTwo, docThree, docFour, docFive};
	public Document[] getDocumentArray() {
		return documentArray;
	}
	
}
