package com.company.LambdaExpressions;

import java.awt.*;

public class LambdaMain {
    public static void main(String[] args) {
        ButtonListener buttonListener = new ButtonListener();
        buttonListener.button.setBounds(50,100,80,50);
        buttonListener.button.addActionListener(e -> System.out.println("Hello Francis"));
        buttonListener.frame.add(buttonListener.button);

        buttonListener.frame.setSize(200,200);
        buttonListener.frame.setLayout(null);
        buttonListener.frame.setVisible(true);
    }
}
