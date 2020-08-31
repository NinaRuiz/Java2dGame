package dev.codemore.tilegame.display;

import javax.swing.*;
import java.awt.*;

public class Display {

    // Create Variables
    private JFrame frame;
    private Canvas canvas;

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

        // Create new Canvas
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        // Add canvas to the frame
        frame.add(canvas);
        frame.pack();

    }

}
