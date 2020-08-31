package dev.codemore.tilegame.display;

import javax.swing.*;

public class Display {

    // Create Variables
    private JFrame frame;
    private String title;
    private int width, height;

    // Create Display object
    public Display(String title, int width, int height){
        // Instanced variables
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    // createDisplay method
    private void createDisplay(){

        // Create the window
        frame = new JFrame(title);

        // Set window size
        frame.setSize(width,height);

        // Close the program pressing x
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the window at the center
        frame.setLocationRelativeTo(null);

        // Set the window visible
        frame.setVisible(true);

    }

}
