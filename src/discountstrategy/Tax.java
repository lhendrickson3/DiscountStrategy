package discountstrategy;

/**
 * @author lhendrickson
 */
public class Tax implements TaxStrategy{
    private double tax;

    public Tax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
