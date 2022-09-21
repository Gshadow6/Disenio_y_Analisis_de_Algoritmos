/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author AXEL
 */
public class Ventana extends JFrame implements ActionListener{
    JButton saludar;
    public Ventana (){}
    public Ventana (String titulo){
        setTitle(titulo);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        saludar=new JButton("Saluda");
        saludar.addActionListener(this);
        add(saludar);
    }
    public void ActionPerfomed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "hola");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
