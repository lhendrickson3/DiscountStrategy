/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import javax.swing.JOptionPane; 
/**
 *
 * @author User
 */
public class GUIOutput implements OutputStrategy{
    
        
        public void getOutput(String output){    
            JOptionPane.showInputDialog(output);
        }
}
