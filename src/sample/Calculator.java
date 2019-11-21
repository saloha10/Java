package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Calculator extends Application {
    HBox position = new HBox();

    TextField inmattning = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage grund) {

        Button nummero = new Button("0");
        nummero.setOnAction(event -> { inmattning.setText(inmattning.getText()+"0"); });
        nummero.setPrefHeight(100);
        nummero.setPrefWidth(400);
        nummero.setStyle("-fx-font-size: 22");
        // en setstyle som innehåller css

            // nummero.setStyle("-fx-Background-color: lightcoral;");


     //   nummero.setStyle("-fx-border-color:black;");
     // nummero.setStyle("-fx-background-radius:0;");


        Button nummer = new Button("1");
        nummer.setOnAction(event -> { inmattning.setText(inmattning.getText()+"1"); });
        nummer.setPrefHeight(100);
        nummer.setPrefWidth(100);

        nummer.setStyle("-fx-font-size: 22");


        Button nummer2 = new Button("2");
        nummer2.setOnAction(event -> { inmattning.setText(inmattning.getText()+"2"); });
        nummer2.setPrefHeight(100);
        nummer2.setPrefWidth(100);

        nummer2.setStyle("-fx-font-size: 22");

        Button nummer3 = new Button("3");
        nummer3.setOnAction(event -> { inmattning.setText(inmattning.getText()+"3"); });
        nummer3.setPrefHeight(100);
        nummer3.setPrefWidth(100);


        nummer3.setStyle("-fx-font-size: 22");


        Button nummer4 = new Button("4");
        nummer4.setOnAction(event -> { inmattning.setText(inmattning.getText()+"4"); });
        nummer4.setPrefHeight(100);
        nummer4.setPrefWidth(100);
        nummer4.setStyle("-fx-font-size: 22");

        Button nummer5 = new Button("5");
        nummer5.setOnAction(event -> { inmattning.setText(inmattning.getText()+"5"); });
        nummer5.setPrefHeight(100);
        nummer5.setPrefWidth(100);

        nummer5.setStyle("-fx-background-color: LIGHTBLUE");
        nummer5.setStyle("-fx-font-size: 22");


        Button nummer6 = new Button("6");
        nummer6.setOnAction(event -> { inmattning.setText(inmattning.getText()+"6"); });
        nummer6.setPrefHeight(100);
        nummer6.setPrefWidth(100);

        nummer6.setStyle("-fx-font-size: 22");

        Button nummer7 = new Button("7");
        nummer7.setOnAction(event -> { inmattning.setText(inmattning.getText()+"7"); });
        nummer7.setPrefHeight(100);
        nummer7.setPrefWidth(100);


        nummer7.setStyle("-fx-font-size: 23");



        Button nummer8 = new Button("8");
        nummer8.setOnAction(event -> { inmattning.setText(inmattning.getText()+"8"); });
        nummer8.setPrefHeight(100);
        nummer8.setPrefWidth(100);

        nummer8.setStyle("-fx-font-size: 22");



        Button nummer9 = new Button("9");
        nummer9.setOnAction(event -> { inmattning.setText(inmattning.getText()+"9"); });
        nummer9.setPrefHeight(100);
        nummer9.setPrefWidth(100);

        nummer9.setStyle("-fx-font-size: 22");

        Button tecken = new Button("＋");
        tecken.setOnAction(event -> { inmattning.setText(inmattning.getText() + "+"); });
        tecken.setPrefHeight(100);
        tecken.setPrefWidth(100);

        tecken.setStyle("-fx-font-size: 22");

        Button tecken1 = new Button("－");
        tecken1.setOnAction(event -> { inmattning.setText(inmattning.getText() + "-"); });
        tecken1.setPrefHeight(100);
        tecken1.setPrefWidth(100);

        tecken1.setStyle("-fx-font-size: 22");


        Button tecken2 = new Button("*");
        tecken2.setOnAction(event -> { inmattning.setText(inmattning.getText() + "*"); });
        tecken2.setPrefHeight(100);
        tecken2.setPrefWidth(100);

        tecken2.setStyle("-fx-font-size: 22");

        Button tecken3 = new Button("÷");
        tecken3.setOnAction(event -> { inmattning.setText(inmattning.getText() + "/"); });
        tecken3.setPrefHeight(100);
        tecken3.setPrefWidth(100);

        tecken3.setStyle("-fx-font-size: 22");

        Button tecken4 = new Button("═");
        tecken4.setOnAction(event -> { resultat(); });
        tecken4.setPrefHeight(100);
        tecken4.setPrefWidth(100);

        tecken4.setStyle("-fx-font-size: 22");

        Button tecken5 = new Button("⌫");
        tecken5.setOnAction(event -> { inmattning.clear(); });
        tecken5.setPrefHeight(100);
        tecken5.setPrefWidth(100);

        tecken5.setStyle("-fx-font-size: 22");


        Button tecken6 = new Button("%");
        tecken6.setOnAction(event -> { inmattning.setText(inmattning.getText() + "%"); });
        tecken6.setPrefHeight(100);
        tecken6.setPrefWidth(100);

        tecken6.setStyle("-fx-font-size: 22");


// En Textfield ruta
        position = new HBox(inmattning);
        inmattning.setPrefHeight(70);
        position.setSpacing(10);
        inmattning.setStyle("-fx-font-size: 22");

// en gridpane som lägger knapparna i olika rader och kolumner. Gridpanen har namnet "root" som används nedan
        GridPane root = new GridPane();

        root.addRow(0, tecken6, tecken3, tecken2,  tecken5);
        root.addRow(1,  nummer,nummer2, nummer3, tecken);
        root.addRow(2, nummer4, nummer5, nummer6, tecken1);
        root.addRow(3,  nummer7, nummer8, nummer9,  tecken4);
        root.addRow(4, nummero);



// en vbox för att lägga allt vertikalt. Jag la nummero (nummer 0) på vbox eftersom om jag la den i hbox så skulle det att bli lite avstånd mellan knapparna om man använde "width" för knappen
        VBox layout = new VBox(inmattning,root, nummero);
        Scene scene = new Scene (layout, 400, 500);

        grund.setTitle("Miniräknare");

       grund.setScene(scene);

        grund.show();
    }

    //Uträkning för miniräknaren. Använder en metod
    public void resultat(){

       // en arraylist som ska lägga in Strings med hjälp av "resultat"
        ArrayList <String> stringArray= new ArrayList<>();
        //inmattning är textfielden.   När input är kallad från for loopen så ska den returnera en int men man kan skriva Strängar (text) också men inget kommer hända
        String input = inmattning.getText();
        String resultat="";

        // En for loop som tar "input.length" och räknar tills "inmattning" (textfield) rutan är full. Alltså att det ska incrementeras med 1 varje gång man trycker på en knapp och ska skriva ut ett siffra eller symbol
         for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))){
               //lägger in String "resultat" i arraylisten, vilket ska ge "resultat" när värdet har uppfyllts
                stringArray.add(resultat);
                resultat= "";
            }
            else {
                resultat = resultat + input.charAt(i);
            }

        }
        if (resultat.length()>= 1)
            stringArray.add(resultat);

        System.out.println(stringArray);

        for (int i = 0; i < input.length(); i++) {

// char som ska användas för att skriva ett tecken åt gången. Om "Character" inte är ett siffra så ska den skriva ut en tecken (+ , - , * )
            if (!Character.isDigit(input.charAt(i))){
                System.out.println(input.charAt(i));

                if (input.charAt(i)=='+'){
                    double räkna = Double.parseDouble(stringArray.get(0));
                    double räkna1 = Double.parseDouble(stringArray.get(1));

                    double resultat2 = räkna + räkna1;
                    int resutatint=(int)resultat2;

                    System.out.println(resultat2);



                    stringArray.add(0,Integer.toString(resutatint));

                }
                if (input.charAt(i)=='-'){
                    double räkna = Double.parseDouble(stringArray.get(0));
                    double räkna2 = Double.parseDouble(stringArray.get(1));

                    double resultat2 =räkna - räkna2;
                    int resultatInt = (int) resultat2;

                    System.out.println(resultat2);



                    stringArray.add(0,Integer.toString(resultatInt));

                }

                if (input.charAt(i)=='*'){
                    double räkna = Double.parseDouble(stringArray.get(0));
                    double räkna1 = Double.parseDouble(stringArray.get(1));

                    double resultat2 =räkna * räkna1;
                    int resultatInt = (int) resultat2;

                    System.out.println(resultat2);



                    stringArray.add(0,Integer.toString(resultatInt));

                }

                if (input.charAt(i)=='/'){
                    double räkna = Double.parseDouble(stringArray.get(0));
                    double räkna1 = Double.parseDouble(stringArray.get(1));

                    double resultat2 = räkna / räkna1;
                    int resultatInt = (int) resultat2;

                    System.out.println(resultat2);


                    stringArray.add(0,Integer.toString(resultatInt));

                }

                if (input.charAt(i)=='%'){
                    double räkna = Double.parseDouble(stringArray.get(0));
                    double räkna1 = Double.parseDouble(stringArray.get(1));

                    double resultat2 = räkna % räkna1;
                    int resultatInt = (int) resultat2;

                    System.out.println(resultat2);



                    stringArray.add(0,Integer.toString(resultatInt));

                }
            }
        }
        inmattning.setText(stringArray.get(0));





    }



}
