/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaparimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author AXEL
 */
public class PruebaParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorEntero=1;
        String n= null;
        n= JOptionPane.showInputDialog("Dame un numero");
        
        try{
            valorEntero=Integer.parseInt(n);
        }catch(Exception e){System.out.println("error");
        }
        if(valorEntero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
    
}
