/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilometertoinchcnvertor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
  class Frames extends JFrame  {
        public static JTextField textField = new JTextField();
        public static JTextField ansText = new JTextField();
        public static JButton button = new JButton();
        public static JLabel label1 = new JLabel();
        public static JLabel label2 = new JLabel();
     Frames(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setMinimumSize(new Dimension(500,200));
        
        setTitle("Kilometer to Inch Conertor");
         
        BuildPanel();
        setVisible(true);
    }
    void BuildPanel() {
        JPanel panel = new JPanel();
        panel.add(textField);
        textField.setText("    000.000     ");
        label1.setText("km");
        panel.add(label1);
        button.setText("Convert");
        panel.add(button);
        ansText.setText("    000.000     ");
        panel.add(ansText); 
         label2.setText("inch");
        panel.add(label2);
        add(panel);
        KilometerToInchCnvertor q = new KilometerToInchCnvertor();
        button.addActionListener(q);
        }
}

/**
 *
 * @author Tanuj
 */
public class KilometerToInchCnvertor implements ActionListener{
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frames frame = new Frames();
         
        }

    @Override
    public void actionPerformed(ActionEvent e) {
       String a = Frames.textField.getText();
       double x = Double.parseDouble(a);
       x= x * 39370.1;
       Frames.ansText.setText(Double.toString(x));
    }
}

