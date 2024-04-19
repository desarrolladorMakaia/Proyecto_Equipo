package Proyecto_Equipo;

import javax.swing.*;
import java.awt.*;

public class funcion extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar un rectángulo
        g.drawRect(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo cuadrado :D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new funcion());
        frame.setVisible(true);
    }
}