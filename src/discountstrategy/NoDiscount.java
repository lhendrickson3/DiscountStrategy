package discountstrategy;

/**
 * @author lhendrickson
 */

public class NoDiscount implements DiscountStrategy{

/**
 * method to getDiscountAmt (unit cost * quantity) 
 */
    public double getDiscountAmt(double unitCost, int qty) {
        return unitCost * qty;
    }
    
}
