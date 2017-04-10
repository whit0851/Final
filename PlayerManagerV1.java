

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.*;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

/**
 *
 * @author charlesw
 */
public class PlayerManagerV1 extends Application {
    Button btnscene1, btnscene2, btnscene3, btnscene4, btnscene2Home, btnscene3Home;
    Label lblscene1, lblscene2, lblscene3, lblscene4;
    HBox pane1, pane2, pane3;
    Scene scene1, scene2, scene3;
    Stage thestage;
    BorderPane bpane1, bpane2, bpane3;
    GridPane gpane1, gpane2, gpane3;
    List <Defensiveplayer> DeffensivePlayers = new ArrayList<Defensiveplayer>();
    List <OffensivePlayer> OffensivePlayers = new ArrayList<OffensivePlayer>();
    List <Object> DraftPicks = new ArrayList<Object>();
    ComboBox DList, OList;
    
    public static void main(String[] args) {
        PlayerManagerV1 Players = new PlayerManagerV1();
        Players.CreatPlayers();
        ComboBox<Defensiveplayer> DList = new ComboBox<Defensiveplayer>(FXCollections.observableArrayList(Players.getdList()));
        ComboBox<OffensivePlayer> OList = new ComboBox<OffensivePlayer>(FXCollections.observableArrayList(Players.getoList()));
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        thestage=primaryStage;
        
//can now use the stage in other methods
        
        BorderPane bpane1 = new BorderPane();
        BorderPane bpane2 = new BorderPane();
        BorderPane bpane3 = new BorderPane();
       
        ListView<Defensiveplayer> list = new ListView<Defensiveplayer>();
        list.setItems(DList);
        bpane2.setAlignment(list, Pos.TOP_LEFT);
        bpane2.setMargin(list, new Insets(12,12,12,12));
        bpane2.setLeft(list);
        
        ListView<String> list1 = new ListView<String>();
        ObservableList<String> items1 =FXCollections.observableArrayList (
        "HOUSE", "DONKEY", "DOG", "BAT");
        list1.setItems(items1);
        bpane2.setAlignment(list1, Pos.TOP_RIGHT);
        bpane2.setMargin(list1, new Insets(12,12,12,12));
        bpane2.setRight(list1);
 
        
//make things to put on panes
        btnscene1=new Button("Start");
        btnscene2=new Button("Back");
        btnscene3=new Button("Next");
        btnscene4=new Button("Back");
        btnscene2Home = new Button("Home");
        btnscene3Home = new Button("Home");
        
                
        btnscene1.setAlignment(Pos.CENTER);
        btnscene2.setAlignment(Pos.CENTER);
        btnscene3.setAlignment(Pos.CENTER);
        btnscene4.setAlignment(Pos.CENTER);
        btnscene2Home.setAlignment(Pos.CENTER);
        btnscene3Home.setAlignment(Pos.CENTER);
        
        
        btnscene1.setOnAction(e-> ButtonClicked(e));
        btnscene2.setOnAction(e-> ButtonClicked(e));
        btnscene3.setOnAction(e-> ButtonClicked(e));
        btnscene4.setOnAction(e-> ButtonClicked(e));
        btnscene2Home.setOnAction(e-> ButtonClicked(e));
        btnscene3Home.setOnAction(e-> ButtonClicked(e));
//lblscene1=new Label("Scene 1");
        //lblscene2=new Label("Scene 2");
        //lblscene3=new Label("Scene 3");
        //make 3 Panes
        
        
        //bpane1.setBottom(addGridpane());
        //bpane2.setBottom(addGridpane());
        //bpane3.setBottom(addGridpane());
        
        gpane1 = new GridPane();
        gpane2 = new GridPane();
        gpane3 = new GridPane();
        
        pane1=new HBox();
        pane2=new HBox();
        pane3=new HBox();
        
        bpane1.setBottom(gpane1);
        bpane2.setBottom(gpane2);
        bpane3.setBottom(gpane3);
        
        pane1.setPadding(new Insets(15, 12, 15, 12));
        pane2.setPadding(new Insets(15, 12, 15, 12));
        pane3.setPadding(new Insets(15, 12, 15, 12));
        
        pane1.setSpacing(30);
        pane2.setSpacing(30);
        pane3.setSpacing(30);
     
     //add everything to panes
        pane1.getChildren().addAll(btnscene1);
        pane2.getChildren().addAll(btnscene2, btnscene2Home, btnscene3);
        pane3.getChildren().addAll(btnscene3Home, btnscene4);
    
        gpane1.setAlignment(Pos.CENTER);
        gpane2.setAlignment(Pos.CENTER);
        gpane3.setAlignment(Pos.CENTER);
        
        gpane1.add(pane1, 0 , 0);
        gpane2.add(pane2, 0 , 0);
        gpane3.add(pane3, 0 , 0);
        
     //make 3 scenes from 3 panes
        scene1 = new Scene(bpane1, 600, 500);
        scene2 = new Scene(bpane2, 600, 500);
        scene3 = new Scene(bpane3, 600, 500);
        
        primaryStage.setTitle("NFL Draft");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource()==btnscene1)
            thestage.setScene(scene2);
        
        else if(e.getSource()==btnscene2)
            thestage.setScene(scene1);
        
        else if(e.getSource()==btnscene3)
            thestage.setScene(scene3);
        
        else if(e.getSource()==btnscene2Home)
            thestage.setScene(scene1);
        
        else if(e.getSource()==btnscene3Home)
            thestage.setScene(scene1);
        
        else
            thestage.setScene(scene2);
    }
public GridPane addGridpane(){
    HBox hbox = new HBox();
    GridPane innergrid = new GridPane();
    hbox.setPadding(new Insets(15, 12, 15, 12));
    hbox.setSpacing(30);
    hbox.setStyle("-fx-background-color: #336699;");

    Button buttonNext = new Button("Next");
    buttonNext.setPrefSize(100, 20);
    buttonNext.setAlignment(Pos.CENTER);
    
    Button buttonBack = new Button("Back");
    buttonBack.setPrefSize(100, 20);
    buttonBack.setAlignment(Pos.CENTER);
    
    buttonNext.setOnAction(e-> ButtonClicked(e));
    
    buttonBack.setOnAction(e-> ButtonClicked(e));
    
    hbox.getChildren().addAll(buttonNext, buttonBack);
    innergrid.setAlignment(Pos.CENTER);
    innergrid.add(hbox, 0 , 0);
    
    return innergrid;
}
public void CreatPlayers(){

		OffensivePlayer OffensivePlayers0 = new OffensivePlayer("Tom Brady", "QB", "Patriots", 76, 225, 39, 12, 3554, 28, 2, 1, 1);
		OffensivePlayer OffensivePlayers1 = new OffensivePlayer("Matt Ryan", "QB", "Falcons", 76, 217, 31, 2, 4944, 38, 7, 10, 12);
		OffensivePlayer OffensivePlayers2 = new OffensivePlayer("Aaron Rodgers", "QB", "Packers", 74, 225, 33, 12, 4428, 40, 7, 2, 3);
		OffensivePlayers.add(OffensivePlayers0);
                OffensivePlayers.add(OffensivePlayers1);
                OffensivePlayers.add(OffensivePlayers2);
                
                Defensiveplayer DffensivePlayers0 = new Defensiveplayer("Le'Veon Bell", "RB", "Steelers", 73, 225, 25, 26, 1268, 7, 0, 1, 1);
		Defensiveplayer DffensivePlayers1 = new Defensiveplayer("Thomas Rawls", "RB", "Seahawks", 69, 215, 23, 34, 349, 3, 0, 2, 3);
		Defensiveplayer DffensivePlayers2 = new Defensiveplayer("Devonta Freeman", "RB", "Falcons", 68, 206, 24, 24, 1079, 11, 0, 2, 5);
                DeffensivePlayers.add(DffensivePlayers0);
                DeffensivePlayers.add(DffensivePlayers1);
                DeffensivePlayers.add(DffensivePlayers2);
    }
public List<Defensiveplayer> getdList(){
      return DeffensivePlayers;
  }
public List<OffensivePlayer> getoList(){
      return OffensivePlayers;
}
}
