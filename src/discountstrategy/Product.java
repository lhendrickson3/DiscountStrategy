package discountstrategy;

/**
 * @author lhendrickson
 */

public class Product {
/**
 * create variable
 */
    private DiscountStrategy discount;
    
/**
 * create variables specific to Product
 */
    private String productId;
    private String productName;
    private double unitCost;
    
/**
 * create finals to fix magic numbers
 */
    private static final double ZERO = 0;
    private static final String ERROR = "Invalid Input";

/**
 * constructor (pass productId, productName, unitCost, discount strategy object)
 */
    public Product(String productId, String productName, double unitCost, DiscountStrategy ds) {
        this.productId = productId;
        this.productName = productName;
        this.unitCost = unitCost;  
        discount = ds;
    }

/**
 * method to getDicountAmt (pass qty)
 * returns unit cost with discount applied * quantity
 */
    public double getDiscountAmt(int qty){
        return discount.getDiscountAmt(unitCost, qty);
    }

/**
 * method to getProductId
 * returns product ID
 */
    public String getProductId() {
        return productId;
    }

/**
 * method to setProductId (pass productId)
 * (if null or 0 throw Exception)
 */
    public void setProductId(String productId) {
        if (productId == null || productId.length() == ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.productId = productId;
    }
    
/**
 * method to getProductName
 * return product name
 */
    public String getProductName() {
        return productName;
    }

/**
 * method to setProductName (pass productName)
 * (if null or 0 throw Exception)
 */
    public void setProductName(String productName) {
        if (productName == null || productName.length() == ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.productName = productName;
    }

/**
 * method to getUnitCost
 * returns unit cost
 */
    public double getUnitCost() {
        return unitCost;
    }
    
/**
 * method to setUnitCost (pass unitCost)
 * (if 0 throw Exception)
 */
    public void setUnitCost(double unitCost) {
        if (unitCost < ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.unitCost = unitCost;
    }
}
