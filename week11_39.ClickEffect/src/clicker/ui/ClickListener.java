package clicker.ui;

import clicker.applicationlogic.Calculator;

import javax.management.timer.Timer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

public class ClickListener implements ActionListener {
    private Calculator calc;
    private JLabel jLabel;

    public ClickListener(Calculator obj1, JLabel obj2){
        calc=obj1;
        jLabel=obj2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        calc.increase();
        String text = String.valueOf(calc.giveValue());
        jLabel.setText(text);
    }


}
