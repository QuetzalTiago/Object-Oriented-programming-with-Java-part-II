package clicker.ui;

import clicker.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetListener implements ActionListener {
    private Calculator calc;
    private JLabel jLabel;

    public ResetListener(Calculator obj1, JLabel obj2){
        calc=obj1;
        jLabel=obj2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        calc.setValue(0);
        String text = String.valueOf(calc.giveValue());
        jLabel.setText(text);
    }
}
