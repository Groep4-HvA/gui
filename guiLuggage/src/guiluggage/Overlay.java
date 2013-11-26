/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiluggage;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author sean
 */
public class Overlay
{
    public JFrame overlays() {
        JFrame frame = new JFrame("Transparent Window");
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        // Without this, the window is draggable from any non transparent
        // point, including points  inside textboxes.
        frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);

        frame.getContentPane().setLayout(new java.awt.BorderLayout());
        frame.getContentPane().add(new JTextField("text field north"), java.awt.BorderLayout.NORTH);
        frame.getContentPane().add(new JTextField("text field south"), java.awt.BorderLayout.SOUTH);
        frame.pack();
        return frame;
    }
}