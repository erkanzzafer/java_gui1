/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Gui1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);

        JPanel panel = new JPanel();

        JButton btn = new JButton("Buton");
        panel.add(btn);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
