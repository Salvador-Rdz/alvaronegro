/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaderectangulo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Salvador
 */
public class AreaDeRectangulo extends JFrame {
    
    public AreaDeRectangulo()
    {
        this.setTitle("Area de Rectangulo");
        this.setSize(720, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(5,1));
        JButton button1 = new JButton("Calcular");
        JLabel label1 = new JLabel ("Área");
        JLabel label2 = new JLabel ("Perímetro");
        JLabel label3 = new JLabel ("Ancho: ");
        JLabel label4 = new JLabel ("Alto :");
        JTextField txt1 = new JTextField("                ");
        JTextField txt2 = new JTextField("                ");
        JPanel widthPanel = new JPanel();
        widthPanel.setLayout(new FlowLayout());
        JPanel heightPanel = new JPanel();
        heightPanel.setLayout(new FlowLayout());
        heightPanel.add(label4);
        heightPanel.add(txt2);
        widthPanel.add(label3);
        widthPanel.add(txt1);
        this.add(heightPanel);
        this.add(widthPanel);
        this.add(button1);
        this.add(label1);
        this.add(label2);
        this.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ancho=txt1.getText();
                String alto=txt2.getText();
                double anch = Double.parseDouble(ancho);
                double alt = Double.parseDouble(alto);
                label1.setText("Área: "+String.valueOf(anch*alt));
                label2.setText("Perímetro: "+String.valueOf(anch+anch+alt+alt));
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AreaDeRectangulo frame = new AreaDeRectangulo();
    }
    
}
