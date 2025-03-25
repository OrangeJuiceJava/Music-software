package main;

import javax.swing.JFrame;

public class Main extends JFrame {

    public static void main(String[] args) {
        System.out.println("Creating Panel...");
        JFrame panel = new JFrame("Music Player Window");
        panel.setSize(500, 500);
        panel.setLocation(100, 100);

        // Set panel visibility
        panel.setVisible(true);
    }

}
