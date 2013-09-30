package discountstrategy;

/**
 * @author lhendrickson
 */

public interface DiscountStrategy {

/**
 * create getDiscountAmt universal method for all discounts
 * (pass unitCost and quantity)
 */
    public abstract double getDiscountAmt(double unitCost, int qty);
    
}
