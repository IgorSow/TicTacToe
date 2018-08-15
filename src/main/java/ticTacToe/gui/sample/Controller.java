package ticTacToe.gui.sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import ticTacToe.Main;
import ticTacToe.game.menuConsole.MenuConsoleMain;
import ticTacToe.gui.adapters.*;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static Controller instance = null;
    @FXML
    Pane PANE_MAIN;

    @FXML
    Button BUTTON_00;
    @FXML
    Button BUTTON_01;
    @FXML
    Button BUTTON_02;
    @FXML
    Button BUTTON_10;
    @FXML
    Button BUTTON_11;
    @FXML
    Button BUTTON_12;
    @FXML
    Button BUTTON_20;
    @FXML
    Button BUTTON_21;
    @FXML
    Button BUTTON_22;

    @FXML
    Button BUTTON_PLAYER1;
    @FXML
    Button BUTTON_PLAYER2;

    @FXML
    Text TEXT_WINNER;

    @FXML
    Line ROW_0;
    @FXML
    Line ROW_1;
    @FXML
    Line ROW_2;

    @FXML
    Line COL_0;
    @FXML
    Line COL_1;
    @FXML
    Line COL_2;

    @FXML
    Line CROSS_1;
    @FXML
    Line CROSS_2;

    @FXML
    TextField TEXTFIELD_ENTER;
    @FXML
    Button BUTTON_ACCEPT_NAME;
    @FXML
    Text TEXT_GETNAME_PLAYER1;
    @FXML
    Text TEXT_GETNAME_PLAYER2;
    @FXML
    Button BUTTON_NEW_GAME;


    public static Controller getInstance() {
        return instance;
    }

    public Pane  getPANE_MAIN() {
        return PANE_MAIN;
    }

    public Button getBUTTON_00() {
        return BUTTON_00;
    }

    public Button getBUTTON_01() {
        return BUTTON_01;
    }

    public Button getBUTTON_02() {
        return BUTTON_02;
    }

    public Button getBUTTON_10() {
        return BUTTON_10;
    }

    public Button getBUTTON_11() {
        return BUTTON_11;
    }

    public Button getBUTTON_12() {
        return BUTTON_12;
    }

    public Button getBUTTON_20() {
        return BUTTON_20;
    }

    public Button getBUTTON_21() {
        return BUTTON_21;
    }

    public Button getBUTTON_22() {
        return BUTTON_22;
    }

    public Button getBUTTON_PLAYER1() {
        return BUTTON_PLAYER1;
    }

    public Button getBUTTON_PLAYER2() {
        return BUTTON_PLAYER2;
    }

    public Text getTEXT_WINNER() {
        return TEXT_WINNER;
    }

    public Line getROW_0() {
        return ROW_0;
    }

    public Line getROW_1() {
        return ROW_1;
    }

    public Line getROW_2() {
        return ROW_2;
    }

    public Line getCOL_0() {
        return COL_0;
    }

    public Line getCOL_1() {
        return COL_1;
    }

    public Line getCOL_2() {
        return COL_2;
    }

    public Line getCROSS_1() {
        return CROSS_1;
    }

    public Line getCROSS_2() {
        return CROSS_2;
    }

    public TextField getTEXTFIELD_ENTER() {
        return TEXTFIELD_ENTER;
    }

    public Button getBUTTON_ACCEPT_NAME() {
        return BUTTON_ACCEPT_NAME;
    }

    public Text getTEXT_GETNAME_PLAYER1() {
        return TEXT_GETNAME_PLAYER1;
    }

    public Text getTEXT_GETNAME_PLAYER2() {
        return TEXT_GETNAME_PLAYER2;
    }

    public Button getBUTTON_NEW_GAME() {
        return BUTTON_NEW_GAME;
    }

    public void initialize(URL location, ResourceBundle resources) {
//
//

//        MyButton button_00 = new MyButton(BUTTON_00, 0, 0);
//        MyButton button_01 = new MyButton(BUTTON_01, 0, 1);
//        MyButton button_02 = new MyButton(BUTTON_02, 0, 2);
//
//        MyButton button_10 = new MyButton(BUTTON_10, 1, 0);
//        MyButton button_11 = new MyButton(BUTTON_11, 1, 1);
//        MyButton button_12 = new MyButton(BUTTON_12, 1, 2);
//
//        MyButton button_20 = new MyButton(BUTTON_20, 2, 0);
//        MyButton button_21 = new MyButton(BUTTON_21, 2, 1);
//        MyButton button_22 = new MyButton(BUTTON_22, 2, 2);
//
//
//
//
//
//        OnClickEvent onClickEvent = new OnClickEvent() {
//            @Override
//            public void onClick(int x, int y) {
//                System.out.println("x = " + x);
//                System.out.println("y = " + y);
//            }
//        };
        System.out.println("Go to window");

        Controller.instance = this;

        GameAdapterGui gameAdapterGui = new GameAdapterGui();
        gameAdapterGui.runGameGui();


        Controller.instance.getBUTTON_NEW_GAME().setOnAction(event -> {
            BUTTON_NEW_GAME.setText("We working at it :)");
        });

    }

//
//        Main.main();

//        button.onClick(onClickEvent);
//        //button1.onClick(onClickEvent);
//
//
//
//        PAIN1.getChildren().removeAll(BUTTON1);
//
//        BUTTONrun.setOnAction(event -> {
//
//            PAIN1.getChildren().add(BUTTON1);
//            LABBEL1.setText(logikaGry.wolajTaMetode());
//        });
//        BUTTON1.setOnAction((event) -> {
//            PAIN1.getChildren().removeAll(BUTTONrun);
//            LABBEL1.setText("aaaa");
//
//        });
//
//        BUTTON1.setOnAction();

}



