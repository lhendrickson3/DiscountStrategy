package discountstrategy;

/**
 * @author lhendrickson
 */

public class LineItem {
/**
 * create variables specific to LineItem
 */
    private Product product;
    private int qty;
    
    
/**
 * create finals to fix magic numbers
 */
    private static final double ZERO = 0;
    private static final String ERROR = "Invalid Input";
    
/**
 * constructor (pass productId, quantity, and fake database item)
 */
    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }
     
/**
 * method to getQty
 * returns quantity of items
 */
    public int getQty() {
        return qty;
    }

/**
 * method to setQty (if 0 throw Exception)
 */
    public void setQty(int qty) {
        if (qty < ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.qty = qty;
    }
    
/**
 * method to getOrigPriceSubtotal (unit cost * quantity)
 * return unit cost * quantity
 */
    public double getOrigPriceSubtotal(){
    return product.getUnitCost() * qty;
    }
    
/**
 * method to getDiscountPriceSubtotal (unit cost with discount applied * quantity)
 * returns unit price with discount applied * quantity
 */
    public double getDiscountPriceSubtotal(){
        return product.getDiscountAmt(qty);
    }
    
/**
 * method to getProductName
 * returns product name
 */
    public String getProductName(){
        return product.getProductName();
    }
}
