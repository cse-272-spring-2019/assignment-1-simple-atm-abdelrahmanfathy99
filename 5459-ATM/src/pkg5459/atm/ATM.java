package pkg5459.atm;

import javafx.application.Application;
import javafx.stage.Stage;

public class ATM extends Application {

    Logic_ATM logic = new Logic_ATM();

    public static void main(String[] args) {
 
        launch(args);//mawgooda goa application wa hya aly btnady start.  
       
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Simple ATM");

        CreditNo_Screen creditNo_Screen = new CreditNo_Screen(primaryStage);
        Services_Screen services_Screen = new Services_Screen(primaryStage);

        creditNo_Screen.prepareScene();
        services_Screen.prepareScene();

        creditNo_Screen.setServices_Screen(services_Screen);
        services_Screen.setCreditNo_Screen(creditNo_Screen);

        primaryStage.setScene(creditNo_Screen.getScene());

        primaryStage.show();

    }
}
