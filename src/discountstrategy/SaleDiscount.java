package discountstrategy;

public class SaleDiscount implements DiscountStrategy{
/**
 * create variables
 */
    private double discountRate;
    
/**
 * constructor (pass discountRate)
 */
    public SaleDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
/**
 * method to getDiscountRate
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
 * method to getDiscountAmt
 */
    public double getDiscountAmt(double unitCost, int qty) {
        return (unitCost * qty)-((getDiscountRate() * unitCost) * qty);
    }
    
}
