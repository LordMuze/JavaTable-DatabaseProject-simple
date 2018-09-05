package guitable;

import java.util.List;

import collection_manage.Collection_Abstract;
import collection_manage.Collection_Operation;
import datasample.DataSample;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import main.DB_Query;
import main.Mongo_Singleton;
import main.TableModelTable;
import org.bson.Document;

import Data.Person;

public class TableViewSample extends Application {
 
    private TableView<Person> table = new TableView<Person>();
    
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
    	Mongo_Singleton single = new Mongo_Singleton();
		single.mongoURI();
		Collection_Abstract collectionManager = new Collection_Operation(single);
		DB_Query queryDB = new DB_Query(collectionManager);
		queryDB.setDataType("fx");
		ObservableList<Person> obsList = queryDB.getPersonDataList();
		List<Object> columnData = queryDB.getColumnNamesData();
        Scene scene = new Scene(new Group());
        stage.setTitle("Bleus");
        stage.setWidth(300);
        stage.setHeight(500);
 
        final Label label = new Label("Bleus Database");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
        TableColumn columnTemp;
        table.setItems(obsList);
        for(int i = 0; i < columnData.size(); i++) {
        	columnTemp = new TableColumn(columnData.get(i).toString());
        	columnTemp.setCellValueFactory(
        			new PropertyValueFactory<Person,String>(columnData.get(i).toString())
        			);
        	
        	table.getColumns().add(columnTemp);
       
        }
        
        for(int i = 0; i < obsList.size(); i++) {
        	System.out.println(obsList.get(i).getName());
        	
        }
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
}