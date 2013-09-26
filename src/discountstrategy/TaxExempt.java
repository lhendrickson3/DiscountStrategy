/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author User
 */
public class TaxExempt implements TaxStrategy{
    
/**
 * method to getTax
 * return 0 (exempt of tax)
 */    
    public double getTax(){
                return 0;
            }
}
