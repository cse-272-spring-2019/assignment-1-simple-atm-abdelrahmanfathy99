package pkg5459.atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Services_Screen {

    Scene scene;
    Stage stage;
    Logic_ATM logic = new Logic_ATM();
    CreditNo_Screen creditNo_Screen;
    private double balance;
    private double depositvalue;
    private double withdrawalvalue;

    public Services_Screen(Stage stage) {

        this.stage = stage;
    }

    public Scene getScene() {
        return this.scene;

    }

    public void prepareScene() {
        //configuration.........................................................
        //Drawing...............................................................
        Label label = new Label("");
        Button withdrawal = new Button("withdrawal");
        withdrawal.setStyle("-fx-background-color:CHOCOLATE");
        Button deposit = new Button("deposit");
        deposit.setStyle("-fx-background-color:CHOCOLATE");
        Button balanceInquiry = new Button("balanceInquiry");
        balanceInquiry.setStyle("-fx-background-color:CHOCOLATE");
        Button previous = new Button("previous");
        previous.setStyle("-fx-background-color:CHOCOLATE");
        Button next = new Button("next");
        next.setStyle("-fx-background-color:CHOCOLATE");
        Button logout = new Button("logout");
        logout.setStyle("-fx-background-color:CHOCOLATE");
        GridPane grid = new GridPane();
        grid.setVgap(8);
        grid.setHgap(10);
        grid.add(withdrawal, 0, 1);
        grid.add(deposit, 0, 2);
        grid.add(balanceInquiry, 0, 3);
        grid.add(previous, 0, 4);
        grid.add(next, 0, 5);
        grid.add(logout, 0, 6);
        grid.add(label, 1, 1);
        scene = new Scene(grid, 300, 230);
        //End Of Drawing........................................................

        //Deposit...............................................................
        Label L1 = new Label("Enter The Amount : ");
        L1.setTextFill(Color.CHOCOLATE);
        L1.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label G1 = new Label("");
        Button depositConfirm = new Button("confirm");
        depositConfirm.setStyle("-fx-background-color:chocolate");
        Button depositPrevious = new Button("Previous");
        depositPrevious.setStyle("-fx-background-color:chocolate");
        TextField T1 = new TextField();
        GridPane grid1 = new GridPane();
        grid1.setVgap(5);
        grid1.add(G1, 1, 1);
        grid1.add(L1, 0, 0);
        grid1.add(T1, 1, 0);
        grid1.add(depositConfirm, 0, 1);
        grid1.add(depositPrevious, 0, 4);
        Scene depositScene = new Scene(grid1, 400, 100);
        //End of Deposit........................................................

        //Deposit submiting.....................................................
        Label G = new Label("");
        G.setTextFill(Color.CHOCOLATE);
        Button depositSubmitPrevious = new Button("previous");
        depositSubmitPrevious.setStyle("-fx-background-color:chocolate");
        GridPane grid5 = new GridPane();
        grid5.add(G, 0, 0);
        grid5.add(depositSubmitPrevious, 0, 1);
        Scene depositSubmitScene = new Scene(grid5, 350, 100);
        //End Of Deposit submiting..............................................

        //Withdrawal............................................................
        Label L2 = new Label("Enter The Amount : ");
        L2.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        L2.setTextFill(Color.CHOCOLATE);
        Label H1 = new Label("");
        Label K = new Label("");
        Button withdrawalConfirm = new Button("confirm");
        withdrawalConfirm.setStyle("-fx-background-color:chocolate");
        Button withdrawPrevious = new Button("Previous");
        withdrawPrevious.setStyle("-fx-background-color:chocolate");
        TextField T2 = new TextField();
        GridPane grid2 = new GridPane();
        grid2.setVgap(10);
        grid2.add(L2, 0, 0);
        grid2.add(K, 0, 3);
        grid2.add(H1, 1, 1);
        grid2.add(withdrawalConfirm, 0, 1);
        grid2.add(T2, 1, 0);
        grid2.add(withdrawPrevious, 0, 2);
        Scene withdrawScene = new Scene(grid2, 400, 100);
         //End Of Withdrawal....................................................   

        //withdrawal submiting..................................................
        Label H = new Label("");
        H.setTextFill(Color.CHOCOLATE);
        Button withdrawSubmitPrevious = new Button("previous");
        withdrawSubmitPrevious.setStyle("-fx-background-color:chocolate");
        GridPane grid4 = new GridPane();
        grid4.setVgap(8);
        grid4.add(H, 0, 0);
        grid4.add(withdrawSubmitPrevious, 0, 2);
        Scene withdrawSubmitScene = new Scene(grid4, 350, 100);
        //End Of withdrawal submiting...........................................

        //Get_Balance...........................................................
        Label L3 = new Label("");
        L3.setTextFill(Color.CHOCOLATE);
        Button balancePrevious = new Button("previous");
        balancePrevious.setStyle("-fx-background-color:chocolate");
        GridPane grid3 = new GridPane();
        grid3.add(L3, 0, 0);
        grid3.add(balancePrevious, 0, 1);
        Scene balanceScene = new Scene(grid3, 250, 100);
        //End Of Getting Balance................................................

        //History_Scene.........................................................
        Label L5 = new Label("Your Transactions : ");
        L5.setTextFill(Color.CHOCOLATE);
        Label L6 = new Label("");
        L6.setTextFill(Color.CHOCOLATE);
        Button historyPrevious = new Button("previous");
        historyPrevious.setStyle("-fx-background-color:chocolate");
        Button historyNext = new Button("next");
        historyNext.setStyle("-fx-background-color:chocolate");
        Button returnMenu = new Button("return");
        returnMenu.setStyle("-fx-background-color:chocolate");
        GridPane grid6 = new GridPane();
        grid6.setVgap(5);
        grid6.add(L5, 0, 0);
        grid6.add(L6, 1, 4);
        grid6.add(historyPrevious, 0, 2);
        grid6.add(historyNext, 0, 4);
        grid6.add(returnMenu, 0, 6);
        Scene historyScene = new Scene(grid6, 300, 150);
        //End Of History_Scene..................................................

        //Registering Action....................................................
        withdrawal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(withdrawScene);

            }

        });
        deposit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(depositScene);

            }

        });
        balanceInquiry.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                // logic.setBalance(balance);
                L3.setText("Balance : " + logic.getBalance() + "$");
                L3.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
                stage.setScene(balanceScene);

            }

        });
        previous.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                L6.setText(logic.previous());
                stage.setScene(historyScene);
            }

        });
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                L6.setText(logic.next());
                stage.setScene(historyScene);

            }

        });
        logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                stage.setScene(creditNo_Screen.getScene());
            }

        });
        withdrawalConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                boolean check;
                String k;
                k = T2.getText();
                //To Check if The Text Number OR String.........................
                check = k.matches("-?\\d+(\\.\\d+)?");
                if (check) {
                    double z = Double.parseDouble(T2.getText());
                    logic.transactionsHistory(k + "$\tWithdraw\n\n");
                    withdrawalvalue = z;
                    System.out.println(z);
                    if (z > logic.getBalance()) {
                        K.setText("Error");
                        K.setFont(Font.font("verdana", FontPosture.ITALIC, 30));
                        stage.setScene(withdrawScene);
                    } else {

                        H.setText("Your New Balance : " + logic.withdrawal(z) + "$");
                        H.setFont(Font.font("verdana", FontPosture.ITALIC, 20));

                        stage.setScene(withdrawSubmitScene);
                    }
                } else {
                    H1.setText("Please Enter Number Only");
                }
            }

        });
        depositConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                boolean check;
                String x;
                x = T1.getText();
                //To Check if The Text Number OR String.........................
                check = x.matches("-?\\d+(\\.\\d+)?");
                //System.out.println(check);
                if (check) {
                    double y = Double.parseDouble(T1.getText());
                    logic.transactionsHistory(x + "$\tDeposited\n\n");
                    G.setText("Your New Balance : " + logic.credit(y) + "$");
                    G.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
                    System.out.println(x);
                    stage.setScene(depositSubmitScene);
                    //logic.printHistory();
                } else {

                    G1.setText(" Please Enter Number Only");
                }
            }
        });
        withdrawSubmitPrevious.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                stage.setScene(withdrawScene);

            }
        });
        withdrawPrevious.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                stage.setScene(scene);

            }

        });
        depositSubmitPrevious.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                //L6.setText(logic.previous());
                stage.setScene(depositScene);
                //stage.setScene(historyScene);
            }

        });
        depositPrevious.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                stage.setScene(scene);

            }

        });
        balancePrevious.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                stage.setScene(scene);

            }

        });
        historyPrevious.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                L6.setText(logic.previous());
                stage.setScene(historyScene);
            }

        });
        historyNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                L6.setText(logic.next());
                stage.setScene(historyScene);

            }

        });
        returnMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                stage.setScene(scene);

            }

        });
        //End Of Registering Action.............................................   
    }

    public void setCreditNo_Screen(CreditNo_Screen creditNo_Screen) {
        this.creditNo_Screen = creditNo_Screen;
    }

}
