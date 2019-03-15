package pkg5459.atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;

public class CreditNo_Screen {

    Stage stage;
    Scene scene;
    Logic_ATM logic = new Logic_ATM();
    Services_Screen services_Screen;

    public CreditNo_Screen(Stage stage) {

        this.stage = stage;
    }

    public void prepareScene() {
        //configuration............................

        //Drawing................................................
        Label cardNo = new Label("Enter Your Card Number : ");
        cardNo.setTextFill(Color.CHOCOLATE);
        cardNo.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label pinNo = new Label("Enter Your Bin Number : ");
        pinNo.setTextFill(Color.CHOCOLATE);
        pinNo.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label validationLabel = new Label();
        TextField pass1 = new TextField();
        PasswordField pass2 = new PasswordField();
        Button confirm = new Button("Confim");
        confirm.setStyle("-fx-background-color:CHOCOLATE");
        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.add(cardNo, 0, 0);
        grid.add(pass1, 0, 1);
        grid.add(pinNo, 0, 2);
        grid.add(pass2, 0, 3);
        grid.add(confirm, 0, 4);
        grid.add(validationLabel, 0, 5);
        //End Of Drawing........................................................

        //Registering Action....................................................
        confirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                boolean check, check1;
                String creditNo = pass1.getText();
                //To Check if The Text Number OR String.........................
                check = creditNo.matches("-?\\d+(\\.\\d+)?");
                String pinNo = pass2.getText();
                check1 = pinNo.matches("-?\\d+(\\.\\d+)?");
                boolean valid = logic.validate(creditNo, pinNo);
                if (check && check1) {
                    if (valid) {

                        stage.setScene(services_Screen.getScene());

                    } else {
                        validationLabel.setText("Wrong Credit_Number OR Pin_Number ");
                    }
                } else {
                    validationLabel.setText(" Please Enter Number Only ");
                }

            }
        });
        //end Of Action.........................................................
        scene = new Scene(grid, 300, 170);

    }

    public Scene getScene() {
        return this.scene;

    }

    public void setServices_Screen(Services_Screen services_Screen) {
        this.services_Screen = services_Screen;
    }

}
