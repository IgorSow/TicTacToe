package ticTacToe.gui.adapters;

import javafx.scene.control.*;

public class MyButton {

    javafx.scene.control.Button button;
    int x;
    int y;
    OnClickEvent onClickEvent = null;

    public MyButton(Button button, int x, int y) {
        this.button = button;
        this.x = x;
        this.y = y;

        button.setOnAction((event) -> {

            if (onClickEvent != null) {
                onClickEvent.onClick(this.x, this.y);
            }

        });

    }

    public void onClick(OnClickEvent onClickEvent) {
        this.onClickEvent = onClickEvent;
    }
}
