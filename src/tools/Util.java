/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
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
        for (int i = 0; i < comp.length; i++){
            JComponent c = comp [i];
            if(c instanceof JTextField){
                ((JTextField)c).setText("");
            }else if (c instanceof JCheckBox){
                ((JCheckBox)c).setSelected(false);
            }else if ( c instanceof JRadioButton){
                ((JRadioButton) c). setSelected(false);
            }else if (c instanceof JComboBox){
                ((JComboBox<?>)c).setSelectedIndex(0);
            }
        }
    }
}
    
    


   // public static void limpar(JComponent ... comp){
     //   for(int i=0; i< comp.length; i++){
       //   ((JTextField)comp[i]).setText("");
        //}
   // }



//Util util = new Util();
//util.habilitar(true);
//instanciof
