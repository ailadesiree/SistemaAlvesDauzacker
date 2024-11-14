/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Aila Desiree
 */
public class Util {
    
    public static void habilitar(boolean valor,JComponent...comp){
         for (int i = 0; i < comp.length; i++) {
             comp[i].setEnabled(valor);
            
        }
    }


    public static void limpar(JComponent ... comp){
        for(int i=0; i< comp.length; i++){
          ((JTextField)comp[i]).setText("");
        }
    }
}


//Util util = new Util();
//util.habilitar(true);
//instanciof
