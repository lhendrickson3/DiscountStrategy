package discountstrategy;

/**
 * @author lhendrickson
 */
public class WisconsinTax implements TaxStrategy{
/**
 * create final variables to fix magic numbers
 */
    private static final double ZERO = 0;
    private static final String ERROR = "Invalid Input";

/**
 * create variable
 */
    private double tax;

/**
 * constructor (pass tax)
 */
    public WisconsinTax(double tax) {
        this.tax = tax;
    }

/**
 * method to get tax
 * return tax
 */
    public double getTax() {
        return tax;
    }

/**
 * method to set tax
 */
    public void setTax(double tax) {
        if (tax < ZERO){
            throw new IllegalArgumentException(ERROR);
        }
        this.tax = tax;
    }

}
