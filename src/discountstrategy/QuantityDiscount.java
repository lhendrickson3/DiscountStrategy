package discountstrategy;

public class QuantityDiscount implements DiscountStrategy{
/**
 * create variables specific to QuantityDiscount
 */
    private double discountRate;
    private int minimumQty;
    
/**
 * constructor (pass discountRate and minimumQty)
 */
    public QuantityDiscount(double discountRate, int minimumQty) {
        this.discountRate = discountRate;
        this.minimumQty = minimumQty;
    } 

/**
 * method getDiscountRate
 * return discount rate
 */
    public double getDiscountRate() {
        return discountRate;
    }

/**
 * method to setDiscountRate (pass discountRate)
 */
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
/**
 * method to getMinimumQty
 * returns minimum quantity needed to get discount
 */
    public int getMinimumQty() {
        return minimumQty;
    }

/**
 * method to setMinimumQty (pass minimumQty)
 */
    public void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }
 
/**
 * method to getDiscountAmt
 * if quantity is less than minimum quantity needed to get discount
 * return unit cost * quantity
 * else
 * return unit cost with discount applied * quantity
 */
    public double getDiscountAmt(double unitCost, int qty) {
        if (qty < minimumQty) {
            return unitCost * qty;
        } else {
        return (unitCost * qty)-((getDiscountRate() * unitCost) * qty);
        }
    }
    
}
