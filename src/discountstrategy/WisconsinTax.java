package discountstrategy;

/**
 * @author lhendrickson
 */
public class WisconsinTax implements TaxStrategy{
    private double tax;

    public WisconsinTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}
