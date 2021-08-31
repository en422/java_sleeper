package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        gui frame = new gui();
        frame.setSize(300,100);
        frame.setTitle("Sleeper");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
